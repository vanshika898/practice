
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class p1 {
    public static void main(String args[]){
         try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the value :");
        int a  = Integer.parseInt(br.readLine());
        System.out.println("Value is:"+a);
        }catch(Exception r){
            System.out.println(r);
        }
    }
    
}
