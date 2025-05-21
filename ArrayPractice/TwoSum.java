
public class TwoSum {

    public static int[] twoSum(int ar[], int target) {
        int arr[] = new int[2];
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] + ar[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }

        return arr;

    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 1, 9};
        int target = 10;
        int[] result = twoSum(arr, target);
        if (result[0] == -1) {
            System.out.println("No valid pair found.");
        } else {
            System.out.println("Indices: " + result[0] + " and " + result[1]);
        }

    }
}
