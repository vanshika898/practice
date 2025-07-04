import java.util.*;


public class q1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(14);
        list.add(674);
        list.add(312);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

       int x = Collections.binarySearch(list, 312);
       if(x!=-1){
        System.out.println("found at index :"+x);
       }else{
        System.out.println("Not found");
       }



    }
    
}
