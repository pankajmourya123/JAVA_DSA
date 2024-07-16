package Linklisted;

/**
 * LinkedList
 */
public class LinkedList {

   class Node {
      int data;
      Node next;

      Node(int x) {
         this.data = x;
         this.next = null;
      }
   }

   Node head, tail;
   int size;

   LinkedList() {
      this.head = null;
      this.tail = null;
      this.size = 0;
   }

   public void insertAddLast(int x) {
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

   public void inserAtBegin(int x) {
      Node newNode = new Node(x);
      if (head == null) {
         head = newNode;
         tail = newNode;
      } else {
         newNode.next = head;
       head=newNode;
      }
      size++;
   }

   public void insertAt(int idx, int x) {
      Node newNode = new Node(x);
      Node temp = head;
      for (int i = 0; i < idx - 1; i++) {
         if (temp != null) {
            temp = temp.next;
         } else {
            throw new IndexOutOfBoundsException("Index out of range");
         }
      }
      newNode.next = temp.next;
      temp.next = newNode;
   }

   public void display() {
      Node temp = head;
      while (temp != null) {
         System.out.print(temp.data + " ");
         temp = temp.next;
      }
      System.out.println();
   }

   public int length() {
      return size;
   }

   public void displayRecursion(Node head) {
      if (head == null) {
         return;
      }
      System.out.print(head.data + " ");
      displayRecursion(head.next);
   }

   public void displayReverse(Node head) {
      if (head == null) {
         return;
      }

      displayRecursion(head.next);
      System.out.print(head.data + " ");
   }

   public int getElement(int idx) {
      Node temp = head;
      for (int i = 0; i < idx; i++) {
         temp = temp.next;
      }
      return temp.data;
   }

   public void deleteAtIndex(int idx) {
      if (idx < 0 || idx >= size) {
         throw new IndexOutOfBoundsException("Index out of range");
      }

      if (idx == 0) {
         head = head.next;
         if (head == null) {
            tail = null; // agar ek hi element hai toh
         }
      } else {
         Node temp = head;
         for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
         }

         temp.next = temp.next.next;
         if (temp.next == null) {
            tail = temp; // when the last node is deleted
         }
      }
      size--;
   }


   public void removeFirst(){
      if (head == null) {
         throw new IllegalStateException("List is empty");
     }
      head=head.next;
      if(head==null){
         tail=null;
      }
      size--;
   }

   public void removeLast(){
      if(head==tail){
         head=null;
         tail=null;
      }else{
         Node temp=head;
         while(temp.next!=tail){
            temp=temp.next;
         }
         temp.next=null;
         tail=temp;
      }
size--;

   }
   public static void main(String[] args) {
      LinkedList ll = new LinkedList();
      ll.insertAddLast(1);
      ll.insertAddLast(2);
      ll.insertAddLast(3);
      ll.insertAddLast(4);
      ll.display();
      ll.insertAt(2, 5);
      ll.display();
      ll.deleteAtIndex(2);
      ll.display();
System.out.println(ll.getElement(2));
   }
}