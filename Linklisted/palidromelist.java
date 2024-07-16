package Linklisted;

import functions.palidrome;

public class palidromelist {
    static public class Node {
        int data;
        Node next;

        Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    public static Node middle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node revsere(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node prev = revsere(head.next);
        head.next.next = head;
        head.next = null;
        return prev;

    }
  
     public static boolean isPalindrome(Node head){
        if(head ==null || head.next==null){
            return true;
        }

        Node mid=middle(head);

        Node secondHalf=revsere(mid.next);
        Node temp=head;
        Node temp2=secondHalf;
        boolean flag=true;
        while (temp2!=null) {
            if(temp.data!=temp2.data){
  flag=false;
  break;
            }
            temp=temp.next;
            temp2=temp2.next;
        }
     return flag;
     }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
       boolean ans= isPalindrome(a);
       System.out.println(ans);
    }
}
