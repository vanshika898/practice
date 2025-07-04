import java.util.stream.Stream;
import java.util.*;
//compareing String using method reference
public class Second {
    public static void main(String[] args) {
        String arr[] = {"gfg","IDE","GFG"};
        Arrays.sort(arr,String::compareToIgnoreCase);
        Arrays.stream(arr).forEach(System.out::println);
        

    }
}
