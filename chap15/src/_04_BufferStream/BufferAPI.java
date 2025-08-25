package _04_BufferStream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferAPI {
    public void save(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("c_buffer.txt"))){
            bw.write("가나다라");
            bw.newLine();
            bw.write("ㅁㄴㅇㄹ");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
