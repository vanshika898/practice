import java.util.*;
public class firstRepeating {

    public static int firstElement(int arr[]){
   HashMap<Integer,Integer>h1 = new HashMap<>();
   for(int items : arr){
    if(h1.containsKey(items)){
        h1.put(items,h1.get(items)+1);
    }else{
        h1.put(items, 1);
    }
   }

   for(int i=0;i<arr.length;i++){
    if(h1.get(arr[i])>1){
        return i+1;
    }
   }
   return -1;
 }
    public static void main(String[] args) {
        int arr[] =  {1,2,3,1,4};
        System.out.println(firstElement(arr));
    }
}
/*
 * Given an array arr[], find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest.

Note:- The position you return should be according to 1-based indexing. 
 */