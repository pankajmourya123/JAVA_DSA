package Qeues;

import java.util.*;

public class Collecque {
    public static void main(String[] args) {
          java.util.Queue<Integer> q = new LinkedList();
    //    Queue<Integer> q=new Queue(0);
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);


       while(!q.isEmpty()) {
           System.out.println(q.peek());
           q.remove();
       }

    }
}
