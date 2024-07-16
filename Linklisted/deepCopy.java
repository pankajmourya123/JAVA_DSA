package Linklisted;

public class deepCopy {
    static class Node{
        int data;
        Node next;
        Node(int x){
            this.data=x;
            this.next=null;
        }
    } 
    public static void display(Node head){
        Node temp=head;
        while (head!=null) {
            System.out.print(head.data+" ");
            head=head.next;
        }
System.out.println();
    }

    public static Node deepCopy(Node head){
      Node newHead=new Node(head.data);
        Node curr=newHead;
        head=head.next;
        while(head!=null){
            curr.next=new Node(head.data);
            curr=curr.next;
            head=head.next;
        }
        return newHead;
    }


    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
      a.next=b;
      b.next=c;
      c.next=d;
      d.next=e;
      display(a);
      Node dup=deepCopy(a);
      display(dup);
    }
}
