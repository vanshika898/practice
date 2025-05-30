//Get Shallow Copy of HashMap

//Write a Java program to get a shallow copy of a HashMap instance.

import java.util.HashMap;

public class DataCopy {
    public static void main(String[] args) {
        HashMap<String,Integer>hm = new HashMap<>();

        hm.put("india", 200);
        hm.put("japan",300);
        HashMap<String,Integer> new_Hm1 = new HashMap<>();
       new_Hm1 = (HashMap<String, Integer>) hm.clone();
       System.out.println(new_Hm1);

    }
    
}
