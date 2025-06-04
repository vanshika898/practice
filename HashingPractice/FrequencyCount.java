/*Given a string str, the task is to find the
 frequency of each character of a string using an unordered_map in C++ STL.

 */
import java.util.HashMap;
public class FrequencyCount {

   public static  void countFreq(String s){
       HashMap<Character,Integer> h1 = new HashMap<>();
       for(int i=0;i<s.length();i++){
         
        if(!h1.containsKey(s.charAt(i))){
            h1.put(s.charAt(i), 1);

        }else{
            h1.put(s.charAt(i),h1.get(s.charAt(i))+1);
        }

        
       }

       for(char ch : h1.keySet()){
        System.out.print(ch);
        System.out.println(" "+h1.get(ch)+ " ");
       }
        }

       
   




    public static void main(String[] args) {
        String a= "vanshika";
        countFreq(a);
        
    }
}
