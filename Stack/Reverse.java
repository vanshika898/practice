
import java.util.Stack;

public class Reverse {

    public static void reverse(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            s.push(c);
        }
        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String s = "vanshika";
        reverse(s);
    }

}
