package collectionprograms.arraylist;

import java.util.ArrayList;

public class Firstelement {
    public static void main(String[] args) {
           ArrayList<String> al=new ArrayList<String>();
         al.add("blue");
        al.add("pink");
        al.add("orange");
        System.out.println(al);
        al.add(0, "palegreen");
        al.add(0,"palepaluu");
        System.out.println(al);
    }
}
