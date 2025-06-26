
import java.util.Stack;

public class postfixToPrefix {

    public static boolean isOperator(char x) {
        switch (x) {
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;
    }

    public static String postToPre(String str) {
        Stack<String> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isOperator(c)) {
                String op1 = s.pop();
                String op2 = s.pop();
                String temp = c + op2 + op1;
                s.push(temp);
            } else {
                s.push(String.valueOf(c));
            }

        }
        return s.peek();
    }

    public static void main(String[] args) {
        String s = "AB+CD-*";
        String k = postToPre(s);
        System.out.println(k);

    }
}
