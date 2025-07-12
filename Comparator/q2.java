import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Comparator;
public class q2 {
    /*Example 2: Working of reverseOrder() in Comparator.
 */
    public static void main(String args[]){
        String arr[] = {"gfg","ghh","null","neha","sarika"};
        Arrays.sort(arr,Comparator.reverseOrder());

        Arrays.stream(arr).forEach((i)->System.out.println(i));


    }
}
