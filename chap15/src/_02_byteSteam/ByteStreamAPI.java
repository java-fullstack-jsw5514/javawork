package _02_byteSteam;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ByteStreamAPI {
    public void fileSave() {
        try(FileOutputStream fout = new FileOutputStream("a_byte.txt")){
            fout.write(97);
            fout.write('b');
//            fout.write("asdfasfsfasfafda".getBytes());
            
            byte[] arr = {99,100,101};
            fout.write(arr);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void fileRead() {
        try(FileInputStream fin = new FileInputStream("a_byte.txt")){
            for(int ch=fin.read(); ch != -1; ch = fin.read()){
                System.out.print((char)ch);
            }
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
