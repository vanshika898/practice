
public class BitonicPoint {

    public static int findPoint(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 7, 8, 3};
        System.out.println(findPoint(arr));
    }
}
