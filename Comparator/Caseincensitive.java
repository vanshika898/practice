import java.util.stream.Stream;
import java.util.*;
/*
 * Input: arr[] = ["Abc", "Xyz", "fghfg", "adas", "tuTY", "dsa"]
Output: Abc adas dsa fghfg tuTY Xyz
 */

public class Caseincensitive {
    public static void main(String[] args) {
        String arr[] = {"Abc", "Xyz", "fghfg", "adas", "tuTY", "dsa"};
        Arrays.sort(arr,String.CASE_INSENSITIVE_ORDER);
        Arrays.stream(arr).forEach(System.out::println);

    }
}
