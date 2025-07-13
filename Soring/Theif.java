
import java.util.Arrays;
import java.util.Collections;

/*Sample Problem: The thief problem in Java
Given an array of N items, and a value K, the task is to find the maximum sum of values that the thief can steal by picking exactly K items. That is, the sum of values of the K most valuable items the thief picks should be maximized.

Examples:

Input: arr[] = {3, 7, 2, 5, 12, 30}
K = 3
Output: 49
Explanation: The thief picks the three items with the highest values: 30, 12, and 7. Their sum is 30 + 12 + 7 = 49.

Input: arr[] = {8, 10, 2, 50, 80, 20}
K = 4
Output: 160
Explanation: The thief picks the four items with the highest values: 80, 50, 20, and 10. Their sum is 80 + 50 + 20 + 10 = 160.


 */
public class Theif {

    static public int getTheifPick(Integer arr[], int k) {
        Arrays.sort(arr, Collections.reverseOrder());
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];

        }
        return sum;

    }

    public static void main(String[] args) {
        Integer inp[] = {3, 7, 2, 5, 12, 30};
        int k = 3;
        System.out.println(getTheifPick(inp, k));

    }
}
