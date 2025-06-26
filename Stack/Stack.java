public class Stack
{

    public static Node head = null;
    public static Node tail = null;

    public void push(int data){
        Node newNode = new Node(data);
        if(head == null){
             head =  newNode;
            return;
        }
        newNode.next  = head;
        head = newNode;

    }
    public static  boolean isEmpty(){
        return head == null;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty!!");
            return  Integer.MIN_VALUE;
        }
        int d = head.data;
        head = head.next;
        return d;

    }
    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }

    
    public static void main(String[] args) {
        Stack  s = new Stack();
        s.push(20);
        s.push(30);
        s.push(40);

        while(!isEmpty()){
            System.out.print(s.peek()+ " ");
            s.pop();
        }
        System.out.println();
    }
}
class Node{
    int data ;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}