import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
 class frequencyM {
    public static void main(String[] args) {
        List<Integer>l1 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(10);

      System.out.println("frequency :" + Collections.frequency(l1, 10));


    }
}
