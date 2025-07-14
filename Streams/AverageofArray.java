import java.lang.reflect.Array;
import java.util.stream.Stream;
import java.util.Arrays;
public class AverageofArray {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,7,8};
        double avg = Arrays.stream(arr).average().getAsDouble();
        System.out.println("average :"+avg);
    }
}
