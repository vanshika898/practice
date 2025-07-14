import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

public class parallelStream {
    public static void main(String[] args) {
        List<Integer>l1 = new ArrayList<>();
        l1.add(20);
         l1.add(10);
          l1.add(70);
           l1.add(80);
            l1.add(3);
             l1.add(7);

       l1.parallelStream().filter(x->x%2==0).filter(x->x>10).forEach(System.out::println);      
    }
    
}
