package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class File_Practice {
    public static void main(String[] args)throws Exception {
        FileWriter fw=new FileWriter("data.txt");
        fw.write("How are you Diapk?");
        fw.close();

        BufferedReader br=new BufferedReader(new FileReader("data.txt"));
        String line;
        while((line = br.readLine()) !=null){
            System.out.println(line);
        }
        br.close();

        FileReader fr=new FileReader("data.txt");
        int ch;
        while((ch=fr.read()) !=-1){
            System.out.print((char) ch);
        }
        fr.close();
    }
}
