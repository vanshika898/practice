import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class toArrayM {
    public static void main(String[] args) {
        List<Integer>l1 = new ArrayList<>();

        l1.add(10);
        l1.add(29);
        l1.add(23);
        //  Object [] a = l1.toArray();
        Integer []a = new Integer[l1.size()];
        a = l1.toArray(a);
         Arrays.stream(a).forEach(System.out::println);
    }
}
