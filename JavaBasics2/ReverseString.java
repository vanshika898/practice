public class ReverseString {
    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s)); // Output: "olleh"
    }
}
