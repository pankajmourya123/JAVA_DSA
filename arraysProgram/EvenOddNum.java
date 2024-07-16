package arraysProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenOddNum {
    public static void main(String[] args) {
        int[] a = { 21, 12, 34, 56, 76, 54, 33, 22 };
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                al1.add(a[i]);
            } else {
                al2.add(a[i]);
            }
        }
       System.out.println("Even number are");
       int total1=0;
       for (int  no : al1) {
       
        total1=total1+no;
        System.out.print(no+" ");
       }
       System.out.println();
     System.out.println(al1.size());
   System.out.println(total1);


     System.out.println("Odd number are");
     int total2=0;
     for (int  no : al2) {
  
      total2=total2+no;
      System.out.print(no+" ");
      
     }
  System.out.println();
   System.out.println(al2.size());
   System.out.println(total2);
    }
}
