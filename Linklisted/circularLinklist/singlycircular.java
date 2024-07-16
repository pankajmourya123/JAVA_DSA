package Linklisted.circularLinklist;

public class singlycircular {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    static Node head;
    static Node tail;
    int size = 0;
    static int count=0;

    public static void display() {
        if (head == null)
            return;

            Node temp = head;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
        System.out.println();
    }

    public static void insertAtHead(int x) {
        Node newNode = new Node(x);
    
        if (head == null) { 
            head = newNode;
            head.next = head;
            tail = head; 
        } else {
            newNode.next = head;
            head = newNode; 
            tail.next = head; 
        }
    }

    public static void insertAtTail(int x) {
        Node newNode = new Node(x);
    
        if (head == null) { 
            head = newNode;
            head.next = head;
            tail = head; 
        } else {
            newNode.next = head; 
            tail.next = newNode; 
            tail = newNode; 
        }
    }

     public static void insertAtidx(int idx,int x){
        Node temp=head;
        
        for (int i = 0; i <idx-1; i++) {    
            temp=temp.next;
            count++;
        }
        Node newNode = new Node(x);
        newNode.next = temp.next;
        temp.next = newNode;
     }
    public static void displayRandom(Node random ){
        if (random == null) { 
            return;
        }
    
        Node temp = random; 
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != random); 
    
        System.out.println();
    }

    public  static void deleteHead(){
        tail.next=tail.next.next;
        head=head.next;
    }
    public static void deleteTailiftailhave(){
      if(head==tail){
        head=null;
        tail=null;
      }else{
        Node temp=head;
        while (temp.next!=tail) {
            temp=temp.next;
        }
        temp.next=head;
        tail=temp;
      }
    }
    public static void deleteTailiftailnothave(){
        if(head==tail){
            head=null;
            tail=null;
          }else{
            Node temp=head;
            while (temp.next.next!=head) {
                temp=temp.next;
            }
            temp.next=head;
            tail=temp;
          }
    }
    public static void deleteAtIdx(int idx){
        if(idx==0){
            deleteHead();
        }else{
            Node temp=head;
            for (int i = 0; i < idx-1; i++) {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    public static void main(String[] args) {
        insertAtHead(0);
        insertAtHead(1);
        insertAtHead(2);
        insertAtHead(3); 
        insertAtTail(56);
        insertAtTail(90);
        insertAtTail(89);
        // display();
        // deleteHead();
        // display();
        // deleteTailiftailhave();
        // deleteTailiftailhave();
        // deleteTailiftailnothave();
        deleteAtIdx(3);
        display();
    }
    
}
