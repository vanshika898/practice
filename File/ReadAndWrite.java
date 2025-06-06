import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ReadAndWrite {
    public static void main(String args[]){
        File fileIn = new File("C:\\Users\\DELL\\Downloads\\vanshikanigam8-Learn Java.pdf");
        File fileOut = new File("C:\\Users\\DELL\\Downloads\\vanshikanigam8-Learn Java-copy.pdf") ;
       FileInputStream fileInputStream = null;
       FileOutputStream fileOutputStream = null;
       
        try{
           fileInputStream = new FileInputStream(fileIn);
           fileOutputStream = new FileOutputStream(fileOut);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(fileInputStream.available());
        } catch (IOException e) {
            
            e.printStackTrace();
        }

        int i=0;
        try{
            while((i=fileInputStream.read())!=-1){
                fileOutputStream.write(i);

            }
        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }finally{
            if(fileInputStream!=null){
                try{
                    fileOutputStream.close();
                }catch(IOException ioe){
                    System.out.println(ioe.getMessage());
                }
            }
            if(fileOutputStream!=null){
                try {
                   fileOutputStream.close(); 
                } catch (IOException ioe) {
                    System.out.println(ioe.getMessage());
                }
                
            }
        }
    }
}
