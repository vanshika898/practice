import java.util.stream.Stream;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class SortingString {

//sorting list using stream api ascending and descing order
    public static void main(String[] args){
        List<String>Fruit = new ArrayList<String>();
        Fruit.add("Banana");
        Fruit.add("Apple");
        Fruit.add("Orange");
        Fruit.add("WaterMelon");
        //ascending order
       // Fruit.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

       //change into list 
       //List <String> sorted = Fruit.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
       //System.out.println(sorted);
         // if make decscending
       Fruit.stream().sorted((a1,a2)->a2.compareTo(a1)).forEach(System.out::println);
       System.out.println("-------------------------------------------------------------");

       Fruit.stream().sorted().forEach(System.out::println);


    }
    
}
