
public class reverseInGroup {

    public static void reverseInGrp(int arr[], int k) {
        int si = 0;
        while (si < k - 1) {
            int temp = arr[si];
            arr[si] = arr[k-1];
            arr[k-1] = temp;
            si++;
            k--;
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        reverseInGrp(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
