/*
 * Given two arrays a[] and b[] of size m and n respectively, 
 * the task is to determine whether b[] is a 
 * subset of a[]. Both arrays are not sorted, and elements are distinct.
 * 
 * 
 * 
 * 
 * 
 * 
 *  */
import java.util.HashSet;
public class SubsetOfAnother {
    public static boolean isSubset(int a[],int b[]){
       HashSet<Integer> h1 = new HashSet<>();
        for(int i=0;i<a.length;i++){
            h1.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
           if(h1.contains(b[i])){
            return true;
           } 
        }
        return false;
    }
    public static void main(String args[]){
        int a[] = {1,2,3,4,5,6};
        int b[] = {11,12,9};
        if(isSubset(a, b)){
            System.out.println("b is the subset of a");
        }else{
            System.out.println("b is  not the subset of a");
        }
    }
}
