package Linklisted;

public class deleteMiddle {
    static class Node{
        int data;
        Node next;
        Node(int x){
            this.data=x;
            this.next=null;
        }
    }

    public static Node deleteLeftMiddle(Node head){
        Node slow=head;
        Node fast=head;

        while(fast.next.next!=null  && fast.next.next.next!=null){
  slow=slow.next;
  fast=fast.next.next;
        }
   slow.next=slow.next.next;
        return head;
    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();


    }
    public static void main(String[] args) {
        Node a= new Node(1);
        Node b= new Node(2);
        Node c= new Node(3);
        Node d= new Node(4);
        Node e= new Node(5);
        Node f= new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        System.out.println("Original List:");
        display(a);

        Node midr = deleteLeftMiddle(a);
        
        System.out.println("List after deleting middle node:");
        display(midr);
       
    }
}
