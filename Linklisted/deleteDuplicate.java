package Linklisted;

public class deleteDuplicate {
    static public class Node {
           int data;
           Node next;
           Node(int x){
            this.data=x;
            this.next=null;
           }
    }
public static Node removeDulipcate(Node head){
    Node temp=head;
    while (temp!=null && temp.next!=null) {
        if(temp.data==temp.next.data){  
            // agar hum yaha par temp.data==temp.data output aaayegaa 1  matlab voo 2 baar aane waale delete ho jayega
            temp.next=temp.next.next;
        }else{
            temp=temp.next;
        }
    }
    return head;
}
public static void display(Node head){
    Node temp=head;
    while (temp!=null) {
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();
}
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(2);
        Node d=new Node(3);
        Node e=new Node(3);
        Node f=new Node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

  display(a);
  removeDulipcate(a);
  display(a);
    }
}
