
import java.util.*;

public class StackUsingArrayList {

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek() + " ");
            s.pop();
        }
    }
}

class Stack {

    ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public void push(int data) {
        list.add(data);
    }

    public int pop() {
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    public int peek() {
        return list.get(list.size() - 1);
    }

}
