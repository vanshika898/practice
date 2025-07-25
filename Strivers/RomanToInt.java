
import java.util.HashMap;

public class RomanToInt {
    public static int romanToInt(String s){
        HashMap<Character,Integer> hs = new HashMap<>();
        hs.put('I',1);
        hs.put('V',5);
        hs.put('X',10);
        hs.put('L',50);
        hs.put('M',100);
        hs.put('C',500);
int sum = 0;
        for(int i=0;i<s.length();i++){
            int value = hs.get( s.charAt(i));
            
            if(i+1< s.length()&& value<hs.get(s.charAt(i+1))){
                sum-=value;
            }else{
                sum+=value;
            }

        }
        return sum;
    }
    public static void main(String[] args) {
       String s = "III";
       System.out.println(romanToInt(s)); 
    }
}
