
import java.util.Comparator;
import java.util.stream.*;

public class Aggreagate {
    public static void main(String args[]){
        //count max,min
        Stream<Integer>number = Stream.of(1,2,3,5,6,8,8);
        //Count
        System.out.println("count the number :"+number.count());
         Stream<Integer>number1 = Stream.of(1,2,3,5,6,8,8);
       //Minimum
        Integer minNumber = number1.min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min number : "+ minNumber);
        //Maximum
          Stream<Integer>number2 = Stream.of(1,2,3,5,6,8,8);
         Integer maxNumber = number2.max(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Min number : "+ maxNumber);






    }
}
