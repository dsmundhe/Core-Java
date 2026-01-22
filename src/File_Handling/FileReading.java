package File_Handling;

import java.io.File;

public class FileReading {
    public static void main(String[] args){
        File file=new File("hello.txt");
        System.out.println(file.isFile());
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
    }
}
