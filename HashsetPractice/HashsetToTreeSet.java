import java.util.*;


public class HashsetToTreeSet {
    public static void main(String[] args) {
        HashSet <Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);

        TreeSet<Integer>t1 = new TreeSet<>(s1);//here convert hashst to treeSet

        System.out.println("treeset"+t1);
        System.out.println("Hashset"+s1);
        

    }
}
