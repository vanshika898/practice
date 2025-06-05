
import java.io.*;
public class fileCreate {
    public static void main(String[] args)  throws IOException{
         File fo = new File("vanshika.txt");
         fo.createNewFile();

       try(  FileWriter fw  = new FileWriter("vanshika.txt",true)){
      
        fw.write("vanshika");
        fw.write(System.lineSeparator());
        fw.write("tansha");
         fw.write(System.lineSeparator());
       }
}
    
}
