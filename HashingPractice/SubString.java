import java.util.*;
public class SubString {
    public static void printSubString(String a){
        HashSet<String>h1 = new HashSet<>();
        
        for(int i=0;i<a.length();++i){
            String s = "";
            for(int j=i;j<a.length();++j){
               s+=a.charAt(j);
               h1.add(s);
            }
        }
        for(String items :h1){
            System.out.print(items+" ");
        }
        System.out.println();
      

    }
    public static void main(String args[])
    {
     String s = "aaabc";
     printSubString(s);
     


    }
}
