
import java.util.stream.Stream;

public class first {

    public static void main(String args[]) {
        Stream<String> stream = Stream.of("a", "b", "c");
        stream.forEach(System.out::println);
        // stream.forEach(i->System.out.println(i));
        // stream.forEach(i->System.out::println);

        //create through sources

        


    }
}
