public class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

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

    public int removeFirst() {
        if (head == null) {
            return -1;
        } else if (head.next == null) {
            int var = head.data;
            head = null;
            return var;
        } else {
            int var = head.data;
            head = head.next;
            return var;
        }
    }

    public int removeLast() {
        if (head == null) {
            return -1;
        } else if (head.next == null) {
            int var = head.data;
            head = null;
            return var;
        }
        Node dum = head;
        while (dum.next != tail) {
            dum = dum.next;
        }
        int var = tail.data;
        dum.next = null;
        tail = dum;
        return var;

    }

    public int removeInBetween(int index) {
        if (head == null) {
            return -1;
        } else if (head.next == null) {
            int var = head.data;
            head = null;
            return var;
        } else {
            Node dum = head;
            int i = 0;
            while (i < index - 1) {
                dum = dum.next;
                i++;
            }
            int var = dum.next.data;
            dum.next = dum.next.next;
            return var;
        }
    }

    public void addInBetween(int data, int index) {
        Node newNode = new Node(data);
        if (head == null) {
            tail = head = newNode;
            return;
        }

        int i = 0;
        Node dum = head;
        while (i < index - 1) {
            dum = dum.next;
            i++;
        }
        newNode.next = dum.next;
        dum.next = newNode;
    }

    public void printLinkedList(Node head) {
        if (head == null)
            return;
        Node dum = head;
        while (dum != null) {
            System.out.print(dum.data + "-->");
            dum = dum.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.printLinkedList(head);
        ll.addLast(30);
        ll.printLinkedList(head);
        ll.addInBetween(2, 1);
        ll.printLinkedList(head);
        ll.removeFirst();
        ll.printLinkedList(head);
        ll.removeInBetween(1);
        ll.printLinkedList(head);
    }
}