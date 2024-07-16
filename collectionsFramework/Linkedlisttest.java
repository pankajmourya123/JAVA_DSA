package collectionsFramework;

import java.util.LinkedList;

public class Linkedlisttest {
public static void main(String[] args) {
        
    LinkedList<Integer> llist=new LinkedList<>();
    // llist.add(9);
    // llist.add(8);
    // llist.add("ppppp");
    // llist.add(6);
    // llist.add(4);
    // System.out.println(llist.toString());
    // llist.addFirst(0);
    //   System.out.println(llist.toString());
    //   llist.addLast(66);
    //        System.out.println(llist.toString());
    //        llist.addLast(99);
    //        llist.getLast();
    //        llist.getFirst();
       llist.add(2);
       llist.add(3);
       llist.add(4);
       llist.add(5);
       llist.add(7);

      

        // Print the elements of the array
      int[] array = llist.stream().mapToInt(Integer::intValue).toArray();

        // Print the elements of the array
        for (int element : array) {
            System.out.println(element);
        }
}
    
}
