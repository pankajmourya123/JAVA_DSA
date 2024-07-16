package Stack;

import java.util.Stack;

public class Stackoperations {
   public static void main(String[] args) {
    Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        int add=6;
        System.out.println(s);
        insertAtBottom(s, add);
        System.out.println(s);
        removeBottom(s);
        removeBottom(s);
        System.out.println(s);
   
        
   }

   public static void insertAtBottom(Stack<Integer> s,int ele){
    if(s.isEmpty()){
      s.push(ele);
      return;
    }

    int curr=s.pop();
    insertAtBottom(s, ele);
    s.push(curr);
   }

   public static void removeBottom(Stack<Integer> s){
      if(s.isEmpty()){
         return;
      }
      if(s.size()==1){
         s.pop();
         return;
      }
      int curr=s.pop();
      removeBottom(s);
      s.push(curr);
   }

   public static void insertAt(Stack<Integer> s,int ele,int idx){
    if(s.isEmpty()|| idx==0){
          s.push(ele);
          return;
    }
    int curr=s.pop();
    insertAt(s, ele, idx-1);
    s.push(curr);
   }

   public static void deleteAtIdx(Stack<Integer> s, int idx){
      if(s.isEmpty()||idx==0){
         s.pop();
         return;
      }
      int curr=s.pop();
      deleteAtIdx(s, idx-1);
      s.push(curr);
   }

   public static void getElementAtIdx(Stack<Integer> s,int idx){
      if(s.isEmpty()||idx==0){
         System.out.println(s.peek());
         return;

      }
      int curr=s.pop();
      getElementAtIdx(s, idx-1);
      s.push(curr);
   }

   public static int getElementAt(Stack<Integer> stack, int idx) {
      if (idx < 0 || idx >= stack.size()) {
         
         System.out.println("Index out of bounds");
      }

      Stack<Integer> temp = new Stack<>();
      int element = -1;

      for (int i = 0; i <= idx; i++) {
          element = stack.pop();
          temp.push(element);
      }

      while (!temp.isEmpty()) {
          stack.push(temp.pop());
      }

      return element;
  }

  public static void reverseStack(Stack<Integer>s){
   if(s.isEmpty()){
      return;
   }
   int curr=s.pop();
   System.out.println(curr);
   reverseStack(s);
   s.push(curr);
  }

  public static void copyStack(Stack<Integer> src, Stack<Integer> dest) {
   Stack<Integer> temp = new Stack<>();

   while (!src.isEmpty()) {
       temp.push(src.pop());
   }
   while (!temp.isEmpty()) {
       int x = temp.pop();
       src.push(x);
       dest.push(x);
   }
}
}
