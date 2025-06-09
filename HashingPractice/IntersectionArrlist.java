import java.util.ArrayList;
import java.util.HashSet;

public class IntersectionArrlist {
     public static  ArrayList<Integer> intersectionWithDuplicates(int[] a, int[] b) {
     HashSet<Integer>h1=new HashSet<>();
     HashSet<Integer>h3=new HashSet<>();
     ArrayList<Integer>h2 = new ArrayList <>();
     
    for(int i:a){
         if(!h1.contains(i)){
             h1.add(i);
         }
     }
     for(int i:b){
         if(h1.contains(i) && !h3.contains(i)){
             h2.add(i);
             h3.add(i);
         }
     }
     return h2;
     
        
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,4};
        int b[] = {1,2};
        System.out.println(intersectionWithDuplicates(a,b));
        
    }
}
