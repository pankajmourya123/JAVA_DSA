package Linklisted;

public class Nthnodefromlast {
  
   static class Node {
        int data;
        Node next;
  
        Node(int x) {
           this.data = x;
           this.next = null;
        }
     }
     Node head, tail;
     int size;
     Nthnodefromlast(){
        this.head = null;
        this.tail = null;
        this.size = 0;
     }

     public void insertAddLast(int x){
        Node newNode = new Node(x);
      if (head == null) {
         head = newNode;
         tail = newNode;
      } else {
         tail.next = newNode;
       tail=newNode;
      }
      size++;

     }

     public void display() {
        Node temp = head;
        while (temp != null) {
           System.out.print(temp.data + " ");
           temp = temp.next;
        }
        System.out.println();
     }

     public int getnthnodefromend(Node head,int n){
        int m=size;
        int idxfroms=m-n+1;
        Node temp=head;
        for (int i = 1; i <= idxfroms-1; i++) {
            temp=temp.next;
        }
        return temp.data;
     }

     public int getnthnodefromend2(Node head,int n){
        Node fast=head;
        Node slow=head;
        for (int i = 0; i < n; i++) {
            fast=fast.next;
        }

        while (fast!=null) {
            slow=slow.next;
            fast=fast.next;
          
        }
        return slow.data;
     }
     public Node deleteNthnodefromlast(Node head,int n){
        Node slow=head;
        Node fast=head;
        for (int i = 0; i <n ; i++) {
            fast=fast.next;
        }
  if(fast==null){
    head=head.next;
    return head;
  }
        while (fast.next!=null) {
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;
  return head;         
     }
    public static void main(String[] args) {
        
        Nthnodefromlast nl=new Nthnodefromlast();
        nl.insertAddLast(1);
        nl.insertAddLast(2);
        nl.insertAddLast(3);
        nl.insertAddLast(4);
        nl.insertAddLast(5);

       System.out.println( nl.getnthnodefromend(nl.head, 3));
       System.out.println( nl.getnthnodefromend2(nl.head, 3));
    }
}
