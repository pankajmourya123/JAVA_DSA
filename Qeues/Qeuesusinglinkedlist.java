package Qeues;

class Linkedlist {
    int data;
    Linkedlist next;

    Linkedlist(int a) {
        this.data = a;
        next = null;
    }

}

public class Qeuesusinglinkedlist {

    Linkedlist front, rear;
    int size;

    Qeuesusinglinkedlist() {
        this.front = this.rear = null;
        this.size = 0;  
    }

    void push(int a) {
        Linkedlist newnode = new Linkedlist(a);

        if (this.rear == null) {
            this.front = this.rear = newnode;
        } else {
            this.rear.next = newnode;
            this.rear = newnode;  
        }
        size++;  
    }

    int pop() {
        if (this.front == null) {
            return -1;
        }
        int temp = this.front.data;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
        size--;
        return temp;
    }

    int peek() {
        if (this.front == null) {
            return -1;
        }
        return this.front.data;
    }

    boolean isEmpty() {
        return this.front == null;
    }

    int size() {
        return this.size;
    }

    void clear() {
        this.front = this.rear = null;
        this.size = 0;
    }

    void display() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return;
        }
        Linkedlist temp = this.front;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Qeuesusinglinkedlist q = new Qeuesusinglinkedlist();
        q.push(0);
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.display(); 
        
    }
}
