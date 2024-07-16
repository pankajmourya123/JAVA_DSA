package Linklisted;

public class reverseList {
   static class Node{
        int data;
        Node next;
        Node(int x){
            this.data=x;
            this.next=null;
        }
    }

    public static Node reverseListrec(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node prev=reverseListrec(head.next);
        head.next.next=head;
        head.next=null;
        return prev;
    }
    public static void display(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node iterativeRev(Node head){
        Node prev=null;
        Node curr=head;

        while (curr!=null) {
            Node agal=curr.next;
            curr.next=prev;
            prev=curr;
            curr=agal;
        }
        return prev;
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
    //    Node res= reverseList(a);
    // display(res);
    Node res1=iterativeRev(a);
    display(res1);


    }
}
