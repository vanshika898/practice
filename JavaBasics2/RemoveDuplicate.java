import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!seen.contains(c)) {
                result.append(c);
                seen.add(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "programming";
        System.out.println(removeDuplicates(s)); // Output: "progamin"
    }
}
