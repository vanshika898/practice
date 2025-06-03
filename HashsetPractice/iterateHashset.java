import java.util.HashSet;
import java.util.Iterator;
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

Iterator<Integer> q = s1.iterator();
while(q.hasNext()){
    System.out.println("values are with iterator : "+q.next());
}


s1.forEach(System.out::println);
s1.stream().forEach(x -> System.out.println(x));
s1.stream().forEach(System.out::println);
s1.iterator().forEachRemaining(x -> System.out.println(x));





}
}
