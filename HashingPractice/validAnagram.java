import java.util.*;

public class validAnagram {
    public static boolean valid(String s1,String s2){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            Character charr = s1.charAt(i);
            if(map.containsKey(charr)){
                map.put(charr, map.get(charr)+1);
            }else{
                map.put(charr,1);
            }
        }
        for(int i=0;i<s2.length();i++){
            Character charr = s2.charAt(i);
           if(map.get(charr)!=null){
            if(map.get(charr)==1){
                map.remove(charr);
            }else{
                map.put(charr,map.get(charr)-1);
            }
           }
        }
       return map.isEmpty();
    }
    public static void main(String[] args) {
        if(valid("keen","knee")){
        System.out.println("it is a Anagram of each other");
        }else{
            System.out.println("it is not anagram of each other");
        }
    }

}
