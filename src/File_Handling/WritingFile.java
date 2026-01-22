package File_Handling;

import java.io.FileWriter;

public class WritingFile {
    public static void main(String[] args) throws Exception{
        FileWriter fw=new FileWriter("hello.txt");
        fw.write("Hello Mr.Diapk Mundhe");
        fw.close();
    }
}
