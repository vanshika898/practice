public class LinkedList {
    public static Node head = null;
    public static Node tail = null;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printLinkedList() {
        Node act = head;
        while (act != null) {
            System.out.print(act.data + "->");
            act = act.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(20);
        ll.addFirst(10);
        ll.printLinkedList();
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}