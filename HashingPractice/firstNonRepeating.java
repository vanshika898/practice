import java.util.HashMap;
public class firstNonRepeating {
    public static Character firstNonRepeatingCharacter(String s){
      HashMap<Character,Integer>h1 = new HashMap<>();
      for(int i=0;i<s.length();i++){
        char c = s.charAt(i);
      if(!h1.containsKey(c)){
        h1.put(c, 1);
      }else {
        h1.put(c,h1.get(c)+1);
      }
      }

      for(int i=0;i<s.length();i++){
       char c = s.charAt(i);
       if(h1.get(c)==1){
         return c;  
      }
    }
    return null;

}
    public static void main(String args[]){
        String s ="geeksforgeeks";
        System.err.println(firstNonRepeatingCharacter(s));
    }
}
