
import java.io.IOException;
import java.io.InputStreamReader;


public class p2 {
    public static void main(String args[]) throws  IOException{
        try(InputStreamReader isr = new InputStreamReader(System.in)){
            System.out.print("Enter value :");
            int letter = isr.read();
            while(isr.ready()){
                System.out.println((char) letter);
                letter = isr.read();
            }
         isr.close();
        }
    }
    
}
