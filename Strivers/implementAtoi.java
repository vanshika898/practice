
import java.util.Arrays;

public class implementAtoi {
    public static boolean impleemnt(String s ,String k){
    if(s.length()!=k.length()) return false;
       char arr[] = s.toCharArray();
       char arr2[] = k.toCharArray();
       Arrays.sort(arr);
       Arrays.sort(arr2);

       return Arrays.equals(arr,arr2);



  
    }
    public static void main(String args[]){
 String s = "anagram";
 String k = "nagaram";

 System.out.println(impleemnt(s, k));

    }
}
