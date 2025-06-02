import java.util.*;

public class MyTreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> tm = new TreeMap<>();
        
        // Adding key-value pairs
        tm.put("Apple", 10);
        tm.put("Banana", 5);
        tm.put("Orange", 7);
        
        // Display the TreeMap
        System.out.println(tm);
    }
}
