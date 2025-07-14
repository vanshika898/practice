import java.util.stream.Stream;
import java.util.List;
import java.util.ArrayList;

public class Filter{
    public static void main(String args[]){
        List<Integer> l1  = new ArrayList<>();
        l1.add(20);
        l1.add(43);
        l1.add(30);
        l1.add(7);

        l1.stream().filter( x-> x%2 == 0).forEach(System.out::println);
    }
}