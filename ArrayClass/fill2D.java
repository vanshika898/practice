import java.util.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class fill2D {
    
    public static void main(String args[]){
        int arr[][] = new int [3][4];
        for(int[] row :arr){
            Arrays.fill(row ,1);
            System.out.println(Arrays.toString(row));
        }
        

    }
}
    
    class CollectionsMethod{
        public static void main(String[] args) {
            List <Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,5,6));
            Collections.fill(l1, 2);
            l1.forEach(System.out::println);
        }
    }
