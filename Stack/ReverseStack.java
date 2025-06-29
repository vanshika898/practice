import java.util.ArrayList;
import java.util. Stack;
public class ReverseStack {
    public static void ReverseStackUsing(Stack<Integer>s){
      ArrayList<Integer>a = new ArrayList<>();

      while(!s.isEmpty()){
        int g = s.pop();
        a.add(g);
      }

     a.forEach(i->System.out.print(i+" "));
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.forEach(a->System.out.println(a+ " "));
    }
}
