package collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arraylisttest {
    public static void main(String[] args) {
        // ArrayList al=new ArrayList();
        // al.add(1);
        // al.add(3);
        // al.add(4);
        // al.add(5);
        // al.add(7);
        // al.add(9);
        // al.add(null);
        
        // // System.out.println(al.get(5));
        // // System.out.println(al.lastIndexOf(5));
        // // al.set(0, 88);
        // // System.out.println(al.toString());

        //     int[] array = new int[al.size()];
        // for (int i = 0; i < al.size(); i++) {
        //     array[i] = al.get(i);
        // }

        // // Print the elements of the array
        // for (int element : array) {
        //     System.out.println(element);
        // }
     ArrayList<Integer> collection = new ArrayList<>();
        collection.add(10);
        collection.add(20);
        collection.add(30);

        // Convert the collection to an int array
        // int[] array = new int[collection.size()];
        // for (int i = 0; i < collection.size(); i++) {
        //     array[i] = collection.get(i);
        // }

        // // Print the elements of the array
        // for (int element : array) {
        //     System.out.println(element);
        // }
//   int[] array = new int[collection.size()];
//         int index = 0;
//         for (int element : collection) {
//             array[index++] = element;
//         }

//         // Print the elements of the array
//         for (int element : array) {
//             System.out.println(element);
//         }
  int[] array = collection.stream().mapToInt(Integer::intValue).toArray();
    }
}
