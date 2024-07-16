package Linklisted;

public class Reverser {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        } 
    }
    public void addFirst(int data){
        Node newnNode=new Node(data);
        if(head==null){
            head=newnNode;
        }
        newnNode.next=head;
        newnNode=head;
    }


    public void addLast(int data) {
        Node newNode = new Node(data);
  
  
        if(head == null) {
            head = newNode;
            return;
        }
  
  
        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next;
        }
  
  
        lastNode.next = newNode;
    }

public void print(){
    Node currNode = head;


    while(currNode != null) {
        System.out.print(currNode.data+" -> ");
        currNode = currNode.next;
    }


    System.out.println("null");
}



public void revserLink(){
    if(head == null || head.next == null) {
        return;
    }


    Node prevNode = head;
    Node currNode = head.next;
    while(currNode != null) {
        Node nextNode = currNode.next;
        currNode.next = prevNode;
        prevNode = currNode;
        currNode = nextNode;
    }
    head.next = null;
    head = prevNode;
}
public Node remDup(){
    Node curr=head;
    if(curr!=null && curr.next!=null ){
        if(curr.data==curr.next.data){
            curr.next=curr.next.next;
        }else{
            curr=curr.next;
        }
    }
    return head;
}

public static void main(String[] args) {
    Reverser rs=new Reverser();
    rs.addLast(1);
    rs.addLast(2);
    rs.addLast(3);
    rs.addLast(5);
    rs.addLast(6);
    rs.print();
    rs.revserLink();
    rs.print();
}
}
