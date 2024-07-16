package Linklisted;

public class detectCycle {
    static class Node{
        int data;
        Node next;
        Node(int x){
          this.data=x;
          this.next=null;
        }
  }

  public static boolean isCycle(Node head){
    Node fast=head;
    Node slow=head;

    while (fast!=null && fast.next!=null) {
        slow=slow.next;
        fast=fast.next.next;
        if(slow==fast){
            return true;
        }
    }
    return false;
  }

  public static Node  AtwhatIndexCycle(Node head){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
    if(fast==slow) break;
    }
      Node temp=head;
      while(temp!=slow){
        slow=slow.next;
        temp=temp.next;
      }
      return slow;
  }

  public static void removeCycle(Node head){
    if(!isCycle(head)){
        System.out.print("no cycle detected");
        return;
    }
     Node cyclestart=AtwhatIndexCycle(head);
     Node cycleEnd =cyclestart;
     while (cycleEnd.next!=cyclestart) {
        cycleEnd=cycleEnd.next;
     }
     cycleEnd.next=null;
     
  }

  public static void display(Node head) {
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
        f.next=c;
     //   display(a);// yaha par cycle hai islye inifinte jaa raha hai
       Node ele= AtwhatIndexCycle(a);
       System.out.println(ele.data);

       removeCycle(a);
       display(a);


  }
}
