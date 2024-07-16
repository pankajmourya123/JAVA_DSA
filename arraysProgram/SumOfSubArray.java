package arraysProgram;

import java.util.ArrayList;

public class SumOfSubArray {
 public static void main(String[] args) {
    int[] a={10,40,30,80,60,20,-20,-30,-40};
    int Max_So_Far=Integer.MIN_VALUE;
      int Max_Ending_here=0;
      int s=0;
      int start=0;
      int end=0;
      for (int i = 0; i < a.length; i++) {
        Max_Ending_here=Max_Ending_here+a[i];
        if (Max_So_Far<Max_Ending_here) {
            Max_So_Far=Max_Ending_here;
            start=s;
            end=i;
        }
        if (Max_Ending_here<0) {
           Max_Ending_here=0;
           s=i+1; 
        }
      }
      System.out.println(Max_So_Far);
      System.out.println(start+" "+end);
 }   

  
}