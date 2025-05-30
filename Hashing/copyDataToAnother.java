import java.util.HashMap;

public class copyDataToAnother {

    public static void main(String[] args) {
        HashMap<String,Integer>hm1 = new HashMap<>();

        hm1.put("india",100);
        hm1.put("usa",2000);

        System.out.println(hm1);

        HashMap<String,Integer>hm2 = new HashMap<>();
        hm2.put("japan",5000);
        hm2.put("russia",300);

        System.out.println(hm2);
        hm1.putAll(hm2);

        System.out.println(hm1);
        
    }
}
