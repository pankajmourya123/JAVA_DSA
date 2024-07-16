package collectionsFramework;

import java.util.SortedSet;
import java.util.TreeSet;

public class sortset {
    public static void main(String[] args) {
       SortedSet <Integer> ss =new TreeSet<Integer>() ;
       ss.add(1);
       ss.add(2);
       ss.add(5);
       ss.add(7);
       ss.add(5);
       ss.add(3);
       ss.add(9);
       System.out.println(ss);
System.out.println(ss.first());
System.out.println(ss.last());
System.out.println(ss.headSet(9));
System.out.println(ss.tailSet(5));
System.out.println(ss.subSet(5,9));

        
    //    int[] array = ss.stream().mapToInt(Integer::intValue).toArray();
    //    System.out.println(array.length);
    }
}
