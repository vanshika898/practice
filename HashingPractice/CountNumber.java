/*
 * Given two arrays arr1[] and arr2[] consisting of n and m elements respectively. The task is to find the minimum number of elements to remove from each array such that intersection of both arrays becomes empty and both arrays become mutually exclusive.

Examples: 

Input: arr[] = { 1, 2, 3, 4}, arr2[] = { 2, 3, 4, 5, 8 }
Output: 3
Explanation: We need to remove 2, 3 and 4 from any array.

Input: arr[] = { 4, 2, 4, 4}, arr2[] = { 4, 3 }
Output: 1
Explanation: We need to remove 4 from arr2[]

Input : arr[] = { 1, 2, 3, 4 }, arr2[] = { 5, 6, 7 }
Output : 0
Explanation: There is no common element in both.
 */

import java.util.*;
public class CountNumber {

    public static int CountNumberof(int arr1[],int arr2[]){

        HashSet<Integer>h1 = new HashSet<>();
        HashSet<Integer>result = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            h1.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(h1.contains(arr2[i])){
                result.add(arr2[i]);
            }

        }
        return result.size();
    }


    public static int CountNumberof2(int arr1[],int arr2[]){
        HashMap<Integer,Integer>h1 = new HashMap<>();
        HashMap<Integer,Integer>h2 = new HashMap<>();

         for(int num : arr1){
            if(h1.containsKey(num)){
                h1.put(num,h1.get(num)+1);
            }else{
                h1.put(num,1);
            }
         }

          for(int num : arr2){
            if(h2.containsKey(num)){
                h2.put(num,h2.get(num)+1);
            }else{
                h2.put(num,1);
            }
         }
      int remocve = 0;
      for(int  key : h1.keySet()){
        if(h2.containsKey(key)){
            remocve+=Math.min(h1.get(key), h2.get(key));
        }
      }return remocve;



    }
    public static void main(String[] args) {
        int arr1[]  = {4,2,4,4};
        int arr2[] = { 4,3};
        System.out.println(CountNumberof(arr1, arr2));


        int arr3[] = { 1, 2, 3, 4};
         int arr4[] = { 2, 3, 4, 5, 8 };
         System.out.println(CountNumberof2(arr3, arr4));
    }

    
}
