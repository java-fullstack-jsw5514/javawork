package _01_fileStream;

import java.io.File;
import java.io.IOException;

public class T01_File {
    public static void main(String[] args) {
        try {
            File file1 = new File("test.txt");
            file1.createNewFile();
            System.out.println("파일의 절대경로: "+ file1.getAbsolutePath());
            
            File file2 = new File("C:\\Users\\jsw55\\Documents\\java-fullstack\\mine\\javawork\\chap15\\test2.txt".replace("\\","/"));
            file2.createNewFile();
            
            File file3 = new File("C:\\Users\\jsw55\\Documents\\java-fullstack\\mine\\javawork\\chap15\\test3.txt".replace("\\","/"));
            file3.createNewFile();
            
            File folder = new File("C:/temp1/");
            folder.mkdir();
            
            System.out.println(file1.exists());
            System.out.println(new File("test999.txt").exists());
            
            System.out.println(file1.isFile());
            System.out.println(folder.isFile());
            
            System.out.println("---------------------------------");
            
            File folder2 = new File("parent");
            folder2.mkdir();
            
            File file  =  new File("parent/person.txt");
            file.createNewFile();
            
            System.out.println("파일명: "+ file.getName());
            System.out.println("절대경로: "+ file.getAbsolutePath());
            System.out.println("파일용량: "+ file.length());
            System.out.println("상위폴더: "+ file.getParent());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        
    }
}
