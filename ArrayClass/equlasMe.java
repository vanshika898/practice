import java.lang.reflect.Array;
import java.util.Arrays;

public class equlasMe {
    public static void main(String[] args) {
        Integer arr[] = {1,2,2,4,5};
        Integer arr1[] = {1,2,3,4,5};

        if(Arrays.equals(arr,0,4,arr1,0,4)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    
}

// Equality Check for Non-Primitive Types Using Comparator

class qw {
    public static void main(String[] args) {
        String a[] = {"GFG","QUEST"};
        String b[] = {"gfg","quest"};

        if(Arrays.equals(a,b,String::compareToIgnoreCase)){
        System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
