import java.util.HashMap;

public class wildCard {
    public static void main(String args[]){
     HashMap<Integer,String> h = new HashMap<>();
     h.put(1,"vanshika");
     h.put(2, "neha");
     printArrayList(h);
    }
    public static  void printArrayList(HashMap <?,?> a){
        System.out.println(a);
    }
}
