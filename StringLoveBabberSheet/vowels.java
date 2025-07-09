
public class vowels {

    public static String reverseVowels(String s) {
        char[] k = s.toCharArray();
        int start = 0;
        int end = k.length - 1;
        while (start < end) {
            while (start < end && !isVowel(k[start])) {
                start++;
            }
            while (start < end && !isVowel(k[end])) {
                end--;
            }

            char temp = k[start];
            k[start] = k[end];
            k[end] = temp;
            start++;
            end--;

        }
        return new String(k);

    }

    public static boolean isVowel(char a) {

        a = Character.toLowerCase(a);
        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        String k = "IceCreAm";
        System.out.println(reverseVowels(k));
    }
}
