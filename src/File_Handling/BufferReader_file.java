package File_Handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class BufferReader_file {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("hello.txt"));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();

        try (BufferedReader br1 = new BufferedReader(new FileReader("hello.txt"))) {
            System.out.println(br1.readLine());
        }

        Path path= Paths.get("hello.txt");
        System.out.println(path);

        Files.write(path, "Hello NIO".getBytes());
        String content = Files.readString(path);
        System.out.println(content);
    }
}
