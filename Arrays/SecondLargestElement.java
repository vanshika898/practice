
import java.util.Arrays;

public class SecondLargestElement {

    public static int SecondLargest(int arr[]) {
        int largest = Integer.MIN_VALUE;
        int SecondLargest = -1;
        for (int idx = 0; idx < arr.length; idx++) {
            if (arr[idx] > largest) {
                largest = arr[idx];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > SecondLargest && arr[i] != largest) {
                SecondLargest = arr[i];
            }
        }

        return SecondLargest;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 7};
        System.out.println(SecondLargest(arr));

    }
}
