
public class LinkedList {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        public String toString() {
            return String.valueOf(this.data);
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

    public int removeFromLast(int index) {
        if (head == null) {
            return -1;
        } else if (head.next == null) {
            int d = head.data;
            head = null;
            return d;
        } else {
            Node dum = head;
            int i = 0;
            while (i < size() - index - 1) {
                dum = dum.next;
                i++;
            }
            int a = dum.next.data;
            dum.next = dum.next.next;
            return a;
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
        if (head == null) {
            return;
        }
        Node dum = head;
        while (dum != null) {
            System.out.print(dum.data + "-->");
            dum = dum.next;
        }
        System.out.println("null");
    }

    public void reverseLinkedList() {
        Node curr = head;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }

    public boolean isPallindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node mid = findMid(head);
        Node right = mid.next;
        mid.next = null;

        Node curr = right;
        Node prev = null;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node righthead = prev;
        Node lefthead = head;
        while (righthead != null) {
            if (lefthead.data != righthead.data) {
                return false;
            }
            lefthead = lefthead.next;
            righthead = righthead.next;
        }
        return true;

    }

    public boolean detectCycle(Node head) {
        boolean isCycle = false;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                isCycle = true;
            }
        }
        return isCycle;
    }

    public int size() {
        int size = 0;
        Node act = head;
        while (act != null) {
            act = act.next;
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.printLinkedList(head);
        ll.addLast(20);
        ll.printLinkedList(head);
        ll.addInBetween(10, 1);
        ll.printLinkedList(head);
        System.out.println("Size is :" + ll.size());
        // ll.removeFirst();
        // ll.removeFromLast(1);
        ll.reverseLinkedList();
        Node mid = ll.findMid(head);
        System.out.println("Middle node: " + mid.toString());

        ll.printLinkedList(head);
        // ll.removeInBetween(1);
        // ll.printLinkedList(head);

        if (ll.isPallindrome() == true) {
            System.out.println("pallindrome yes");
        } else {
            System.out.println("not pallindrome");
        }

        if (ll.detectCycle(head) == true) {
            System.out.println("cycle yes");
        } else {
            System.out.println("not cycle");
        }
    }
}
