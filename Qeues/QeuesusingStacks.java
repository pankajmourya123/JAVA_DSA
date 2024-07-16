package Qeues;

import java.util.Stack;



public class QeuesusingStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QeuesusingStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    public void push(int x){
        stack1.push(x);
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }

        if(stack2.isEmpty()){
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
   return stack2.pop();
    }
public int peek(){
    if(isEmpty()){
        System.out.println("Queue is empty");

    }

    if(stack2.isEmpty()){
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }
    return stack2.peek();
}
    public int size(){
        return stack1.size()+stack2.size();
    }
    public boolean isEmpty(){
        return stack1.isEmpty() &&  stack2.isEmpty();
    }
    public static void main(String[] args) {
        QeuesusingStacks q = new QeuesusingStacks();

        q.push(1);
        q.push(2);
        q.push(3);

        System.out.println("Front element: " + q.peek());  // Output: 1

        System.out.println("Dequeue: " + q.pop());  // Output: 1
        System.out.println("Front element after dequeue: " + q.peek());  // Output: 2

        q.push(4);
        System.out.println("Front element after enqueue: " + q.peek()); 
    }
}
