import java.util.Arrays;

public class secondLargest {
    public static int FindSecondLargest(int arr[]){
        Arrays.sort(arr);
         for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=arr[arr.length-1]){
                return arr[i];
            }

        }
        return -1;
    }
    public static void main(String [] args){
        int arr[]= {24,1,34,54,36,89};
        System.out.println(FindSecondLargest(arr));
       
    }
}
