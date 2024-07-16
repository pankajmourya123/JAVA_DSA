package Linklisted.circularLinklist;

public class doubllycircularlinkedlist {
    static class Node {
        int data;
        Node prev;
        Node next;
        Node(int x) {
            this.data = x;
            this.prev = null;
            this.next = null;
        }
    }
    
    private static Node head, tail;
    int size;

    public static void displayhead() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void displayTail() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = tail;
        do {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        } while (temp != tail);
        System.out.println();
    }

    public static void displayFromTailToHead() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = tail;
        do {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        } while (temp != tail);
        System.out.println();
    }

    public static void displayrandom(Node random) {
        if (random == null) {
            System.out.println("Node is null.");
            return;
        }
        Node temp = random;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != random);
        System.out.println();
    }

    public static void insertAthead(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }
    }

    public static void insertAttail(int x) {
        Node newNode = new Node(x);
        if (tail == null) {
            head = newNode;
            tail = newNode;
            newNode.next = newNode;
            newNode.prev = newNode;
        } else {
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }
    }

    public static void insertAtidx(int idx, int x) {
        if (idx < 0) {
            System.out.println("Invalid index.");
            return;
        }
        Node newNode = new Node(x);
        if (idx == 0) {
            insertAthead(x);
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
        if (temp == tail) {
            tail = newNode;
        }
    }

    public static void deletehead() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    public static void deleteAtTail() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
    }

    public static void deleteAtidx(int idx) {
        if (idx < 0 || head == null) {
            System.out.println("Invalid index or list is empty.");
            return;
        }
        if (idx == 0) {
            deletehead();
            return;
        }
        Node temp = head;
        for (int i = 0; i < idx && temp.next != head; i++) {
            temp = temp.next;
        }
        if (temp == head) {
            System.out.println("Index out of bounds.");
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        if (temp == tail) {
            tail = temp.prev;
        }
    }

    public static Node middle(Node head) {
        if (head == null) {
            return null;
        }
        Node slow = head;
        Node fast = head;
        do {
            slow = slow.next;
            fast = fast.next.next;
        } while (fast != head && fast.next != head);
        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5); 

        head = a;
        tail = e;
        a.next = b;
        a.prev = e;
        b.next = c;
        b.prev = a;
        c.next = d;
        c.prev = b;
        d.next = e;
        d.prev = c;
        e.next = a;
        e.prev = d;

        System.out.print("Display from head: ");
        displayhead();

        System.out.print("Display from tail: ");
        displayTail();

        System.out.print("Display from tail to head: ");
        displayFromTailToHead();

        System.out.print("Display random from node c: ");
        displayrandom(c);

        System.out.print("Insert at head (0): ");
        insertAthead(0);
        displayhead();

        System.out.print("Insert at tail (6): ");
        insertAttail(6);
        displayhead();

        System.out.print("Insert at index 3 (99): ");
        insertAtidx(3, 99);
        displayhead();

        System.out.print("Delete head: ");
        deletehead();
        displayhead();

        System.out.print("Delete tail: ");
        deleteAtTail();
        displayhead();

        System.out.print("Delete at index 3: ");
        deleteAtidx(3);
        displayhead();

        System.out.print("Middle of the list: ");
        Node mid = middle(head);
        if (mid != null) {
            System.out.println(mid.data);
        } else {
            System.out.println("List is empty.");
        }
    }
}
