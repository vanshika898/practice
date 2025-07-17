
import java.util.stream.Stream; 
import java.util.Arrays;
class Solution {
    public static  int largestElement(int[] nums) {
        int a = Arrays.stream(nums).max().getAsInt();
        return a;

    
    }
    public static void main(String [] args){
     int a [] = {1,2,4,5,6};
     System.out.println(largestElement(a));
    }
}