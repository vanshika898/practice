
import java.util.ArrayList;
import java.util.Stack;

public class DeleteMid {

    public static void deleteMid(Stack<Integer> s) {

        ArrayList<Integer> a = new ArrayList<>();

        while (!s.isEmpty()) {
            a.add(s.pop());
        }
        int mid = a.size() / 2;
        a.remove(mid);
        System.out.println("Elements after removing middle:");
        a.forEach(i -> System.out.print(i + " "));
        System.out.println();

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        //  while(!s.isEmpty()){
        //     System.out.println(s.peek()+" ");
        //     s.pop();
        //  }
        deleteMid(s);

    }
}
