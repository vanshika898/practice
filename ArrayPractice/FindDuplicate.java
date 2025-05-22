
import java.util.Arrays;

public class FindDuplicate {

    public static int findDuplicateElement(int arr[]) {
        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return arr[i];
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 1, 7};
        System.out.println("Duplicate found of element : " + findDuplicateElement(arr));
    }
}
