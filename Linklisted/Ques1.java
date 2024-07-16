package Linklisted;

public class Ques1 {
    private int size;
    private Node head;

    Ques1() {
        size = 0;
    }

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

   

    public void print() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();  
    }
    

    public void addLast(int data) {
        Node newNode = new Node(data);
    
        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        size++;
    }
    public  void search(int ele){
        Node currnode=head;
        int index=0;
       while (currnode!=null) {
        if(currnode.data==ele){
            System.out.println(ele+" "+" "+index);
        }
        currnode = currnode.next;
        index++;
       }
    }

    public static void main(String[] args) {
        Ques1 list = new Ques1();
        
        list.addLast(1);
        list.addLast(5);
        list.addLast(7);
        list.addLast(3);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);
        list.search(7);

        // list.print();
    }
}
