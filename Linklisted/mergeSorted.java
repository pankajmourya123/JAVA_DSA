package Linklisted;

public class mergeSorted {
    public  static class  Node {
        int data;
        Node next;
        Node(int x){
        this.data=x;
        this.next=null;
        }        
      }

      private Node head,tail;
    int size;
    mergeSorted(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    public  void insertAddLast(int x) {
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
     public static void displaymer(Node head) {
        Node temp = head;
        while (temp != null) {
           System.out.print(temp.data + " ");
           temp = temp.next;
        }
        System.out.println();
     }

public static Node mergeSortedlist(Node list1,Node list2){
    Node temp1=list1;
    Node temp2=list2;
   Node head=new Node(100);
   Node temp=head;
   while(temp1!=null && temp2!=null){
       if(temp1.data<temp2.data){
            Node a=new Node(temp1.data);
           temp.next=a;
           temp=a;
           temp1=temp1.next;
       }else{
            Node a=new Node(temp2.data);
           temp.next=a;
           temp=a;
           temp2=temp2.next;
       }
   }
   if(temp1==null){
       temp.next=temp2;
   }else{
       temp.next=temp1;
   }
   
   return head.next; 
}

    public static void main(String[] args) {
     mergeSorted l1=new mergeSorted();   
     mergeSorted l2=new mergeSorted();   
     
     l1.insertAddLast(1);
     l1.insertAddLast(3);
     l1.insertAddLast(5);
     l2.insertAddLast(2);
     l2.insertAddLast(4);
     l2.insertAddLast(6);
    
     Node merge=mergeSortedlist(l1.head,l2.head);
        displaymer(merge);
    }
}
