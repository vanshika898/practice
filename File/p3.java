import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p3 {
    public static void main(String[] args) throws IOException {
         try(FileReader isr = new FileReader("notes.txt")){
            System.out.print("Enter value :");
            int letter = isr.read();
            while(isr.ready()){
                System.out.print((char) letter);
                letter = isr.read();
            }
         isr.close();
        }
    }
    }

