import java.util.*;
public class twoSum2 {

    public static boolean twoSumIn(int arr[],int target){
       HashSet<Integer>h1= new HashSet<>();
       for(int i=0;i<arr.length;i++){
        int com = target-arr[i];
        if(h1.contains(com)){
            return true;
        }
        h1.add(arr[i]);
       }
       return false;
    }
    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        int target = -2;
        if(twoSumIn(arr, target)){
            System.out.println("yes");

        }else{
            System.out.println("no");
        }
    }
}
