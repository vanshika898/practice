import java.lang.reflect.Array;
import java.util.Arrays; 
import java.util.Comparator; 

class GfG {
    public static void main (String[] args) {
        // Arrays of string
        String[] arr = {"gfg",  "ide"};

        // apply nullsFirst method and sort the array in a natural order
      //  Arrays.sort(arr, Comparator.nullsFirst(Comparator.naturalOrder()));
        System.out.println("---------------------------------------------------");
        Arrays.sort(arr,Comparator.reverseOrder());
            
        // Displaying the Arrays
        System.out.println(Arrays.toString(arr));
    }
}



/*
 * int compare(T t1, T t2): Compares its two arguments for order.
Comparator comparing(KeyExtractor): Accepts a function that extracts a Comparable sort key from a type T and returns a Comparator that compares by that sort key.
Example: Sorting students according to their names by passing the getName() function.
Comparator thenComparing(KeyExtractor): Returns a lexicographic-order comparator with another comparator.
Example: Sorting students first by name and then by roll number.
Comparator naturalOrder(): Returns a comparator that compares Comparable objects in their natural order.
Comparator reversed(): Returns a comparator that imposes the reverse ordering of this comparator.
Comparator reverseOrder(): Returns a comparator that imposes the reverse of the natural ordering.
Comparator nullFirst(Comparator): Returns a null-friendly comparator that considers null to be less than non-null.
Comparator nullLast(Comparator): Returns a null-friendly comparator that considers null to be greater than non-null.

 */