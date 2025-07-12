/*Example 1: Working of nullFirst() and naturalOrder() in Comparator */
import java.util.stream.Stream;
import java.util.Comparator;
import java.util.Arrays;

public class q1{
    public static void main(String[] args) {
    String arr[] = {"gfg",null,"fgh",null};
    Arrays.sort(arr,Comparator.nullsFirst(Comparator.naturalOrder()));
    System.out.println(Arrays.toString(arr));
    Arrays.stream(arr).forEach(System.out::println);


    }
}