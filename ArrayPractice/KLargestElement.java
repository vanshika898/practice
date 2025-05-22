
import java.util.Arrays;

public class KLargestElement {

    public static int KthlargestElement(int arr[], int k) {
        Arrays.sort(arr);
        
        for (int i = 0; i < arr.length; i++) {
            return arr[arr.length - k];
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 1, 6, 6};
        int k = 2;
        System.out.println(KthlargestElement(arr, k));

    }

}
