package Linklisted;


public class Removeduplicates {
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
    Node newNode = new Node(data);
    newNode.next=head;
    head=newNode;
}

public void addLast(int data){
    Node newNode = new Node(data);
    if(head == null) {
        head = newNode;
        return;
    }

    Node lastnode=head;
    while (lastnode.next!=null) {
        lastnode = lastnode.next;
    }
    lastnode.next = newNode;
}

public void removeFirst(){
    if(head==null){
        System.out.println("Empty list,nothing to delete");
        return ;
    }
    head=head.next;
}
public void removeLast(){
    if(head==null){
        System.out.println("khuch nahi bro");
        return;
    }

    if(head.next==null){
        head=null;
        return;
    }

   
    Node currNode = head;
      Node lastNode = head.next;
      while(lastNode.next != null) {
          currNode = currNode.next;
          lastNode = lastNode.next;
      }


      currNode.next = null;
}

public void print(){
  Node currnode=head;
  while (currnode!=null) {
    System.out.print(currnode.data+"-->");
    currnode=currnode.next;
  }
}
public Node removeDup(){
    Node current = head;

    while (current != null && current.next != null) {
        if (current.data == current.next.data) {
           
            current.next = current.next.next;
        } else {
          
            current = current.next;
        }
    }

    return head;
}

    public static void main(String[] args) {
        Removeduplicates list=new Removeduplicates();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(5);
        list.removeDup();
        
       


        list.print();
    }
}
