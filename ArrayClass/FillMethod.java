import java.util.Arrays;


public class FillMethod {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5,7};
       // Arrays.fill(arr,-1);//Example 1: Using Arrays.fill() to fill an entire array
       Arrays.fill(arr,0,2,4);//Using Arrays.fill() to fill a specific range in the array
        System.out.println(Arrays.toString(arr));
        Arrays.stream(arr).forEach((i)->System.out.println(i));
    }
}
