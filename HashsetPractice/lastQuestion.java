import java.util.HashSet;
public class lastQuestion {
    public static int randomOrder(int arr[]){
        HashSet <Integer>h1 = new HashSet<>();
         for(int item : arr){
            if(h1.contains(item)){
              return item;
            }
            h1.add(item);
            
         }
         return -1;
    }
   public static void main(String[] args) {
       int arr[] = { 1, 3, 2, 3, 4};
       System.out.println(randomOrder(arr));
   } 
}
/*
 * 
 * 
 * 
 * Given an array arr[] of size n filled with numbers from 1 to n-1 in random order. The array has only one repetitive element. The task is to find the repetitive element.

Examples:

Input: arr[] = [1, 3, 2, 3, 4]
Output: 3
Explanation: The number 3 is the only repeating element.

Input: arr[] = [1, 5, 1, 2, 3, 4]
Output: 1
Explanation: The number 1 is the only repeating element.
 */
