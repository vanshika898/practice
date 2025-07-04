
import java.util.*;
import java.util.stream.Stream;
import javax.lang.model.element.Element;
//Findfirst method and findAny

public class findMethod {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(x -> System.out.println(x));
        //findfirst
        Optional<Integer> k = list.stream().findFirst();
        System.out.println(k);


        Optional<Integer>j = list.stream().findAny();
        System.out.println(j);

        if(j.isPresent()){
            System.out.println(j.get());
        }else{
            System.out.println("Stream is empty");
        }


        Optional<Integer>j1 = list.stream().findAny();
        System.out.println(j1);

        if(j1.isPresent()){
            System.out.println(j1.get());
        }else{
            System.out.println("Stream is empty");
        }
    }
}
