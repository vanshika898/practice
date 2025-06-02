
import java.util.HashMap;
public class ContainsValues {
    public static void main(String[] args) {
        HashMap<String,Integer>hm1 = new HashMap<>();

        hm1.put("india", 300);
        hm1.put("japan",200);

        if(hm1.containsValue(300)){
            System.out.println("yes");

        }else{
            System.out.println("no");
        }
    }
}
