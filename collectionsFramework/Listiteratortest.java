package collectionsFramework;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class Listiteratortest {
    public static void main(String[] args) {
         LinkedList l= new LinkedList<>();
         l.add("baala");
         l.add("venki");
         l.add("chiru");
         l.add("naag");
System.out.println(l);
        ListIterator li=l.listIterator();
while (li.hasNext()) {
    String s=(String)li.next();
    if(s.equals("venki")){
          li.remove();
    }
    if(s.equals("naag")){
        li.add("chaituu");
    }
    if(s.equals("chiru")){
        li.add("charan");
    }
}
System.out.println(l);
    }
}
