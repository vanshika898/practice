import java.util.stream.Stream;
import java.util.*;

public class Second{
    public static void main(String args[]){
        Collection<String> collection = Arrays.asList("Java","pyhton","J2EE","C","C++");
        Stream <String> stream2 = collection.stream();
        stream2.forEach(System.out::println);

        List <String>list = Arrays.asList("vanshika","tanisha","tisha");
        Stream<String>stream = list.stream();
        stream.forEach(i->System.out.println(i));


   }
}
