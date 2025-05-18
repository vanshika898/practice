
public class LargestElement {

    public static int largest(int arr[]) {
        int LargestE = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > LargestE) {
                LargestE = arr[i];
            }
        }
        return LargestE;

    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 19};
        System.out.println(largest(arr));
    }
}
