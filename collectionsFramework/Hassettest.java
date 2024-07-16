package collectionsFramework;

import java.util.HashSet;

public class Hassettest {
    public static void main(String[] args) {
        // HashSet hs=new HashSet<>(4,1);

        // hs.add(0);
        // hs.add(9);
        // hs.add(null);
        // hs.add("oiuytr");
        // hs.add(7);
        // hs.add(87);
        // System.out.println(hs);
        HashSet<Integer>hs=new HashSet<>();
        hs.add(9);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(7);
    // int[] array = new int[hs.size()];
    //     int index = 0;
    //     for (int element : hs) {
    //         array[index++] = element;
    //     }

    //     // Print the elements of the array
        // for (int element : array) {
        //     System.out.println(element);
        // }
      int[] array = hs.stream().mapToInt(Integer::intValue).toArray();
         for (int element : array) {
            System.out.println(element);
        }
    }
}
