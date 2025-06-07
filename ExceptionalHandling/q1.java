
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class q1 {
    public static void main(String args[]){
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number a:");
        int a = Integer.parseInt(br.readLine());

         System.out.println("Enter number b:");
        int b = Integer.parseInt(br.readLine()); 

        try{
            int c= a+b;
            System.out.println("Sum is :"+c);

            int d = c/0;
            System.out.println(d);

        }catch(ArithmeticException ae){
            System.out.println(ae.getMessage());
        }

        }catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }catch(NumberFormatException Nfe){
            System.out.println(Nfe.getMessage());
        }
    }
}
