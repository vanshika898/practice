

/* 
We are given two arrays a[] and b[], the task is to return intersection of both the arrays in any order. Intersection of two arrays is an array having all 
common elements in both the arrays. The input arrays may contain duplicates.
*/
import java.util.*;
public class intersectionOfArray {
    public static void findInterSection(int a[],int b[]){
        HashSet<Integer>h1 = new HashSet<>();
        HashSet<Integer>h2  =new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(!h1.contains(a[i])){
                h1.add(a[i]);
            }            
        }
        for(int i=0;i<b.length;i++){
            if(h1.contains(b[i])){
               h2.add(b[i]);
            }

        }

        for(int items : h2){
            System.out.println(items);
        }
    }
    public static void main(String[] args) {
        int arr1[] = { 1,2,3,5};
        int arr2[] = {1,2,8};
        findInterSection(arr1,arr2);
        
    }
}
