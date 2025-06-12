public class Test5 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc").intern();
        System.out.println(s1 == s2);
    }
}
