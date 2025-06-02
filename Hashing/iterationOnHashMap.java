import java.util.*;


public class iterationOnHashMap {
    public static void main(String[] args){
        HashMap <String,Integer>hm1 = new HashMap<>();

   hm1.put("Apple",200);
   hm1.put("Banana",300);

   Set<String> s1 = hm1.keySet();
   System.out.println(s1);

   for(String s :s1){
    System.out.println("Key :"+ s + "," +"value :"+hm1.get(s));
   }


    }
}
