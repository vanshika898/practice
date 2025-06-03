import java.util.HashSet;
//  Write a Java program to clone a hash set to another hash set.
public class cloneHashset {
    public static void main(String[] args) {
       HashSet <Integer> s1 = new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(4);
        
        HashSet<Integer> h2 = new HashSet<>();
        h2 = (HashSet<Integer>) s1.clone();
       System.out.println(h2);
        for(int item:h2){
            System.out.println("items are :"+item);
        }
       
    }
    
}
