package Linklisted;

public class IntersectionOfList {
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
    IntersectionOfList (){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
  public  void  addLast(int x){
         Node newNode=new Node(x);
         if (head == null) {
            head = newNode;
            tail = newNode;
         } else {
            tail.next = newNode;
          tail=newNode;
         }
         size++;

  }

  public void display(){
    Node temp=head;
    while (temp!=null) {
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();
  }

  public Node getIntersection(IntersectionOfList list1,IntersectionOfList list2){
    int lenA=getLength(list1.head);
    int lenB=getLength(list2.head);
     
      Node fast=list1.head;
      Node slow=list2.head;

      if(lenA>lenB){
        int diff=lenA-lenB;
        for (int i = 0; i < diff; i++) {
           fast=fast.next; 
        }
      }else{
        int diff=lenB-lenA;
        for (int i = 0; i < diff; i++) {
            slow=slow.next;
        }
      }

      while (fast!=null &&  slow!=null) {
        if(fast==slow){
            return slow;
        }
        fast=fast.next;
        slow=slow.next;
      }
      return null;
  }

  public int getLength(Node head){
    Node temp=head;
    int count=0;
    while (temp!=null) {
        count++;
        temp=temp.next;
    }
    return count;
  }
    public static void main(String[] args) {
        IntersectionOfList l1=new IntersectionOfList();

        IntersectionOfList l2=new IntersectionOfList();

        l1.addLast(1);
        l1.addLast(2);
        l1.addLast(3);
        l1.addLast(4);
        l1.addLast(5);

        l2.addLast(7);
        l2.addLast(6);
        l2.addLast(8);

        Node intersectionode=new Node(6);
        l1.head.next.next.next.next.next=intersectionode;

        l2.head.next.next=intersectionode;

        IntersectionOfList intersectionFinder = new IntersectionOfList();
        Node intersection = intersectionFinder.getIntersection(l1, l2);

        if (intersection != null) {
            System.out.println("Intersection node value: " + intersection.data);
        } else {
            System.out.println("No intersection found.");
        }

    }
}
