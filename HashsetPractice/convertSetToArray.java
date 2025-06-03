import java.util.*;
//The toArray() method in Java is used to convert a collection (like a Set, List, etc.) into an array.
public class convertSetToArray {
    public static void main(String args[]){
        HashSet<Integer>s1 = new HashSet<>();
s1.add(2);
s1.add(3);
s1.add(4);
s1.add(5);

Integer arr[] = new Integer[s1.size()];
s1.toArray(arr);

System.out.println(s1);
for(int i:arr){
    System.out.println(i);
}


    }
}
