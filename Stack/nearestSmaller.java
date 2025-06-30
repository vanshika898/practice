
import java.util.Stack;

public class nearestSmaller {

    public static void nearestSmallerNumber(int arr[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && s.peek() >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                System.out.print("-1" +  " ");
            } else {
                System.out.print(s.peek() + " ");
            }
            s.push(arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 1, 5};
        nearestSmallerNumber(arr);
    }
}
