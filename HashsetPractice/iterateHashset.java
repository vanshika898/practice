import java.util.HashSet;
import javax.swing.text.html.HTMLDocument;

public class iterateHashset {
    public static void main(String args[])
{
HashSet<Integer>s1 = new HashSet<>();
s1.add(2);
s1.add(3);
s1.add(4);
s1.add(5);


for(int item : s1){
    System.out.println("items are :"+item);
}

s1.forEach(System.out::println);
s1.stream().forEach(x -> System.out.println(x));
s1.stream().forEach(System.out::println);
s1.iterator().forEachRemaining(x -> System.out.println(x));





}
}
