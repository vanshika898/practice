import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
public class minMax {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
        l1.add(12);
        l1.add(13);
        l1.add(14);
        System.out.println(Collections.min(l1));
        System.out.println(Collections.max(l1));

    }
}
