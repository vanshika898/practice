
public class MaximumSubArraySumBruteFroce {

    public static int maximumSum(int arr[]) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print("(" + arr[k] + " " + ")");
                    sum += arr[k];
                }
                if (sum > max) {
                    max = sum;
                }

                System.out.println();
            }

            System.out.println();
        }

        return max;
    }

    public static void main(String[] gg) {
        int arr[] = {1, -2, 6, -1, 3};
        System.out.println("maximum sum : " + maximumSum(arr));//o(n^3)
    }
}
