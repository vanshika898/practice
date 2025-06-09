import java.util.function.Function;

public class q2 implements Function<String , Integer> {
    
    @Override
    public Integer apply(String t) {
      return t.length();
    }

    public static void main(String[] args) {
        Function q = (t)->((String) t).length(); 
        System.out.println(q.apply("vanshika"));

        q2 q21  = new q2();
        System.out.println(q21.apply("tanisha"));

    
    }
    
}
