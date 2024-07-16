package collectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
  public static void main(String[] args) {
//     List<Integer>ls=new ArrayList<Integer>() ;
//     List<Integer>ls2=new ArrayList<Integer>() ;
//     ls.add(6);
//     ls.add(7);
//     ls.add(9);
//     ls.add(4);
//     ls.add(4);
//     ls.add(5);
//     // System.out.println(ls.toString());
//     ls2.add(3);
//     ls2.add(3);
//     ls2.add(4);
//     ls2.add(5);
//     ls2.add(3);
//     // ls2.set(3, 77);
//    System.out.println( ls2.indexOf(3));
//    System.out.println( ls2.lastIndexOf(3));
// //    System.out.println( ls2.get(4));
//     // ls2.addAll(4, ls);
//     System.out.println(ls2.toString());
      // Creating arrayList list dynamically
        List<Integer> list = new ArrayList<Integer>();
        // List is created
 
        // Adding elements to the list
        list.add(2);
        list.add(6);
        list.add(8);
        list.add(8);
        list.add(4);
        list.add(2);
        list.add(0);
 
        // Converting list to an array
     int[] primitive = list.stream()
                            .mapToInt(Integer::intValue)
                            .toArray();

                            System.out.println(Arrays.toString(primitive));
  }
}
