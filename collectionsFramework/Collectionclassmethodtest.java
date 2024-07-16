package collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;

public class Collectionclassmethodtest {
    public static void main(String[] args) {
        ArrayList al = new ArrayList(); al.add("Z");
al.add("A");
al.add("K");
al.add("N");
// al.add(new Integer(10));
// al.add(null); //RE: Exception in thread "main" java.lang.NullPointerException System.out.println("Before Sorting:"+al); //Before Sorting:[Z, A, K, N] Collections.sort(al);
System.out.println("Before Sorting:"+al); //Before Sorting:[Z, A, K, N]
 Collections.sort(al);
System.out.println("After Sorting:"+al); //After Sorting:[A, K, N, Z]


    }
}
