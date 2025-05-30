
import java.util.HashMap;



public class creation {
    public static void main(String args[]){
        HashMap<String,Integer> hm = new HashMap<>();
        // Insert  - 0(1)
        hm.put("India",200);
        hm.put("Indonesia",300);
        hm.put("Japan",500);

        System.out.println(hm);

        //get- 0(1)
       System.out.println(hm.get("India"));
       
       //search 0(1)
       System.out.println(hm.containsKey("India"));


       //remove
       hm.remove("Japan");
       System.out.println(hm);

       //size
       System.out.println(hm.size());

       //clear

       hm.clear();
       System.out.println(hm.isEmpty());

    }
    
}
