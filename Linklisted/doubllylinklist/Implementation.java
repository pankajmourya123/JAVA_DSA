package Linklisted.doubllylinklist;

public class Implementation {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int x) {
            this.val = x;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head, tail;
    private int size;

    public Implementation() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtIdx(int idx, int x) {
        if (idx < 0 || idx > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (idx == 0) {
            insertAtHead(x);
        } else {
            Node s = head;
            for (int i = 0; i < idx - 1; i++) {
                s = s.next;
            }
            Node r = s.next;
            Node newNode = new Node(x);
            s.next = newNode;
            newNode.prev = s;
            newNode.next = r;
            if (r != null) {
                r.prev = newNode;
            } else {
                tail = newNode;
            }
        }
        size++;
    }

    public void displayHead() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void displayTail() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public void displayRandom(Node random) {
        Node temp = random;
        while (temp.prev != null) {
            temp = temp.prev;
        }
        displayHead();
    }

    public void insertAtHead(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void insertTail(int x) {
        if (head == null) {
            head = new Node(x);
            tail = head;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node t = new Node(x);
            temp.next = t;
            t.prev = temp;
            tail = t;
        }
        size++;
    }

    public void deleteAtHead() {
        if (head != null) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
        }
    }

    public void deleteAtTail() {
        if (tail != null) {
            if (tail.prev != null) {
                tail = tail.prev;
                tail.next = null;
            } else {
                head = null;
                tail = null;
            }
            size--;
        }
    }

    public void deleteAtIdx(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (idx == 0) {
            deleteAtHead();
        } else if (idx == size - 1) {
            deleteAtTail();
        } else {
            Node s = head;
            for (int i = 0; i < idx - 1; i++) {
                s = s.next;
            }
            Node toDelete = s.next;
            s.next = toDelete.next;
            if (toDelete.next != null) {
                toDelete.next.prev = s;
            }
            size--;
        }
    }

    public static void main(String[] args) {
        Implementation dll = new Implementation();
        dll.insertAtHead(1);
        dll.insertAtHead(2);
        dll.insertAtHead(3);
        dll.insertAtHead(4);
        dll.insertAtHead(5);

        dll.displayHead();
        dll.insertTail(60);
        dll.displayHead();
        dll.insertAtIdx(2, 50);
        dll.displayHead();
        dll.deleteAtHead();
        dll.displayHead();
        dll.deleteAtTail();
        dll.displayHead();
    }
}
