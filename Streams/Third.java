import java.util.stream.Stream;
import java.util.*;


public class Third {
    public static void main(String[] args) {
     
        String[]subArray= {"tiya","jiya","miya","piya"};
        Stream <String> stream6= Arrays.stream(subArray);
        stream6.forEach(System.out::println);
    }
    
}
