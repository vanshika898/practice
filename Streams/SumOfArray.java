import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
public class SumOfArray {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
       
        int sum = al.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);


       


    }
}
