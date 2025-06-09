import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class creatingException {

    public static void exam() {
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     try{
         System.out.println("Enter number :");
        int a = Integer.parseInt(br.readLine());
         System.out.println("Enter number :");
         int b =  Integer.parseInt(br.readLine());
try{
         int c = a/b;
         System.out.println(c);
}catch(InvalidInputException i2){
            System.out.println(i2.getMessage());
}
     }catch(IOException ioe){
        System.out.println(ioe.getMessage());
     }catch(NumberFormatException iv){
        System.out.println(iv.getMessage());
     }
       
         
        }
    
    public static void main(String args[]){
        
          exam(); 

    }
}
class InvalidInputException extends RuntimeException{
    InvalidInputException(String message){
        super(message);
    }
}
