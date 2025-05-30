
import java.util.HashMap;
import java.util.Set;



public class getKeySetValue {
    public static void main(String[] args) {
        HashMap<String,Integer> hm1 = new HashMap<>();
        hm1.put(
            "india", 200);
            hm1.put("japan",300);

     Set keyset = hm1.keySet();

     System.out.println(keyset);
    }
}
