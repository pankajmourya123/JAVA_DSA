package Linklisted;

public class findMiddel {
    static class Node{
          int data;
          Node next;
          Node(int x){
            this.data=x;
            this.next=null;
          }
    }
    public static Node getrigthMiddle(Node head){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static Node getleftMiddle(Node head){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        
    Node midr=   getrigthMiddle(a);
    Node midl=   getleftMiddle(a);
    System.out.println(midl.data);
    System.out.println(midr.data);
    
    

    }
}
