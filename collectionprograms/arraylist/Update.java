package collectionprograms.arraylist;

import java.util.ArrayList;

public class Update {
    public static void main(String[] args) {
          ArrayList<String> al=new ArrayList<String>();
         al.add("blue");
        al.add("pink");
        al.add("orange");
        System.out.println(al);
    al.set(0, "kkkkk");
    al.set(1, "kkkkkllll");
    System.out.println(al);
    }
}
