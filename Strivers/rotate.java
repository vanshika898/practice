//package Strivers;
import java.util.stream.Stream;
import java.util.Arrays;
public class rotate {
    public static void reverse(int arr[],int si,int ei){
       while(si<=ei){
        int temp = arr[si];
        arr[si] = arr[ei];
        arr[ei] = temp;
        si++;
        ei--;
       }


            }
    public static  void rotateArray(int arr[],int k){
     
            reverse(arr,0,k);
            reverse(arr,k+1,arr.length-1);
            reverse(arr, 0, arr.length-1);
        

    }
    public static void main(String args[]){
        int arr[]  = {-1,-100,3,99};
         rotateArray(arr, 2);
        Arrays.stream(arr).forEach(System.out::println);

    }
    
}
