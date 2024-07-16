package Linklisted;

public class splitOddEven {
    static class Node {
        int data;
        Node next;
        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void splitList(Node head) {
       Node temp =head;
       Node dummyodd=new Node(0);
       Node dummyeven=new Node(0);
       Node odd=dummyodd;
       Node even=dummyeven;

       while (temp!=null) {
        if(temp.data %2 ==0){
              even.next=temp;
              even=even.next;
        }else{
            odd.next=temp;
            odd=odd.next;
        }
        temp=temp.next;
       }

       even.next=null;
       odd.next=null;
       printList(dummyeven.next);
       printList(dummyodd.next);
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        System.out.println("Original List:");
        printList(a);
        splitList(a);
    }
}
