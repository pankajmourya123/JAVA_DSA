package collectionsFramework;

import java.util.Vector;

public class Vectortest {
    public static void main(String[] args) {
        Vector <Integer>v=new Vector<>();
        v.addElement(9);
        v.addElement(90);
        System.out.println(v.toString());
        v.removeElementAt(1);
        System.out.println(v.toString());
       int[] array = v.stream().mapToInt(Integer::intValue).toArray();
       System.out.println(v.toString());
    }
}
