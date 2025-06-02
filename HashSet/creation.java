/*

1.no duplicates
2.Unordered
3.Null allowed


*/ 
import java.util.*;
public class creation {
    
    public static void main(String args[]){
     HashSet<Integer> s1 = new HashSet<>();
     //add 0(1)

     s1.add(1);
     s1.add(2);
     s1.add(3);
     s1.add(1);// not add because contains unique values
     System.out.println(s1);
     //remove 0(1)
     s1.remove(2);
     System.out.println(s1);
     //contains 0(1)
     if(s1.contains(1)){
        System.out.println("set contain this data");
     }else{
        System.out.println("no contains");
     }
     //Size ()
     System.out.println("Size of the set is :"+s1.size());
     //clear
     s1.clear();
     System.out.println(s1.size());
     //isEmpty()
     System.out.println(s1.isEmpty());

    }
}
