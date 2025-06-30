import java.util.Stack;
public class QueueUsingStack {

   
    public static void main(String[] args) {
      Queue q = new Queue();
      q.enqueqe(1);
      q.enqueqe(2);
      q.enqueqe(3); 
      
      System.out.println(q.dequeue());
      System.out.println(q.dequeue());
      System.out.println(q.dequeue());
    }
}

class Queue{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer>s2 = new Stack<>();

    public void enqueqe(int data){
        while(!s1.isEmpty()){
            s2.push(s1.peek());
            s1.pop();
        }
        s1.push(data);

        while(!s2.isEmpty()){
            s1.push(s2.peek());
            s2.pop();
        }
    }



    public int dequeue(){
        if(s1.empty()){
            return -1;
        }

        int top = s1.peek();
        s1.pop();
        return top;
    }
}
