package Qeues;

import java.util.ArrayList;

public class QeuesusingArraylist {
    private ArrayList<Integer> queue;
    QeuesusingArraylist(){
         queue=new ArrayList<>();
    }

    void push(int a){
        queue.add(a);
    }

    public int pop(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        return queue.remove(0);
    }
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.get(0);
    }
    boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
    public static void main(String[] args) {
        QeuesusingArraylist q = new QeuesusingArraylist();

        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println("Front element: " + q.peek()); 

        System.out.println("Dequeue: " + q.pop());  
        System.out.println("Front element after dequeue: " + q.peek());  

        q.push(4);
        System.out.println("Front element after enqueue: " + q.peek());
        
    }
}
