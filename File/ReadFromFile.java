import java.io.*;
public class ReadFromFile {
    public static void main(String args[]) throws IOException{
        try(BufferedReader f  = new BufferedReader(new FileReader("notes.txt"))){
            String c = f.readLine();
            while(c!=null){
                System.out.println(c);
               c =  f.readLine();
            }
            f.close();

        }
    }
    
}
