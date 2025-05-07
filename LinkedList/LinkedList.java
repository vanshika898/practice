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

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addInBetween(int index, int data) {
        Node newNode = new Node(data);
        Node act = head;
        int i = 0;
        while (i < index - 1) {
            act = act.next;
        }
        newNode.next = act.next;
        act.next = newNode;
    }

    public int removeFirst() {
        if (head == null) {
            return -1;
        } else if (head.next == null) {
            int cv = head.data;
            head = null;
            return cv;
        } else {
            int cv = head.data;
            head = head.next;
            return cv;
        }

    }

    public int size() {
        Node act = head;
        int size = 0;
        while (act != null) {
            act = act.next;
            size++;
        }
        return size;
    }

    public int removeLast() {
        if (head == null) {
            return -1;
        } else if (head.next == null) {
            int cv = head.data;
            head = null;
            return cv;
        }
        Node act = head;

        while (act.next.next != null) {
            act = act.next;

        }
        int a = act.next.data;
        act.next = null;
        return a;

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
        ll.addLast(30);
        ll.addInBetween(1, 15);
        ll.printLinkedList();
        ll.removeFirst();
        ll.printLinkedList();
        ll.removeLast();
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