import java.util.*;
// Write a Java program to find numbers less than 7 in a tree set.
public class NumberlessThan7 {
    public static void main(String args[]){
    TreeSet <Integer>t1 = new TreeSet<>();
    t1.add(1);
    t1.add(9);
    t1.add(19);
    t1.add(2);
    t1.add(3);

    for(int items : t1){
        if(items < 7){
            System.out.println(items);
        }
    }

    TreeSet<Integer> t2 = (TreeSet<Integer>)t1.headSet(7); 
    System.out.println(t2);


    }

    
}
