package _03_charStream;

import java.io.*;

public class CharStreamAPI {
    public void save(){
        File file = new File("b_char.txt");
        try(FileWriter fw = new FileWriter(file)){
            fw.write("Hello World\n가나다라마바사aaaa");
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void load(){
        File file = new File("b_char.txt");
        try(FileReader fr = new FileReader(file)){
            for(int ch = fr.read(); ch != -1; ch = fr.read()){
                System.out.print((char)ch);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
