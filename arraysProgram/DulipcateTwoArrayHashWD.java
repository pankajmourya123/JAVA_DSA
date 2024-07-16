package arraysProgram;

import java.util.Arrays;
import java.util.HashSet;

public class DulipcateTwoArrayHashWD {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] arr2 = { 6, 4, 3, 2, 1 ,2,2,2};
       
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for (int no : arr1) {
            hs1.add(no);
        }
        for (int no : arr2) {
            hs2.add(no);
        }
        for (int no : hs2) {
            boolean b = hs1.add(no);
            if (b == false) {
                System.out.println(no+" ");
                
            }
        }
       
    }
}
