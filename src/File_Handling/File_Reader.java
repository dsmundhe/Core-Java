package File_Handling;

import java.io.FileReader;

public class File_Reader {
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("hello.txt");
        int ch;
        while((ch=fr.read()) !=-1){
            System.out.print((char) ch);
        }
        fr.close();
    }
}
