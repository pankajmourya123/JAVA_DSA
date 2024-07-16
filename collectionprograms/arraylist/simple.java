package collectionprograms.arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class simple {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<String>();
        al.add("blue");
        al.add("pink");
        al.add("orange");
           ListIterator li=al.listIterator();
           while (li.hasNext()) {
            System.out.println(li.next());
           }
    }
}
