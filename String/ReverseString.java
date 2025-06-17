
public class ReverseString {

    public static String ReverseString(String a) {
        int left = 0;
        int right = a.length() - 1;
        StringBuilder s = new StringBuilder(a);

        while (left < right) {
            char temp = s.charAt(left);
            s.setCharAt(left, s.charAt(right));
            s.setCharAt(right, temp);
            left++;
            right--;
        }
        return s.toString();
    }

    public static void main(String[] args) {
        String a = "vanshika";

        System.out.println(ReverseString(a));
    }
}
