package collectionprograms.arraylist;

import java.util.ArrayList;

public class Getelement {
    public static void main(String[] args) {
         ArrayList<String> al=new ArrayList<String>();
         al.add("blue");
        al.add("pink");
        al.add("orange");
        System.out.println(al);
       System.out.println(al.get(0));
       System.out.println(al.get(2));
    }
}
