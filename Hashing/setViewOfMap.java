
import java.util.HashMap;
import java.util.Set;



public class setViewOfMap {

    // private static boolean s11;
    public static void main(String[] args) {
        HashMap<String,Integer>hm1 = new HashMap<>();
        hm1.put("india",200);
        hm1.put("USA",300);

        Set s1= hm1.entrySet();
        System.out.println(s1);
        
    }
    
}
