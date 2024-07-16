// Given an array of integers, print a sum triangle from it such that the first level has all array elements. From then, at each level number of elements is one less than the previous level and elements at the level is be the Sum of consecutive two elements in the previous level. 
// Example :
 

// Input : A = {1, 2, 3, 4, 5}
// Output : [48]
//          [20, 28] 
//          [8, 12, 16] 
//          [3, 5, 7, 9] 
//          [1, 2, 3, 4, 5] 

// Explanation :
// Here,   [48]
//         [20, 28] -->(20 + 28 = 48)
//         [8, 12, 16] -->(8 + 12 = 20, 12 + 16 = 28)
//         [3, 5, 7, 9] -->(3 + 5 = 8, 5 + 7 = 12, 7 + 9 = 16)
//         [1, 2, 3, 4, 5] -->(1 + 2 = 3, 2 + 3 = 5, 3 + 4 = 7, 4 + 5 = 9)

package Recursion;

import java.util.Arrays;

public class Sumoftriangle {
    public static void main(String[] args) {
      int []  A = {1, 2, 3, 4, 5};
        sumoftri(A);
    }
    public static void sumoftri(int [] a){
        if(a.length<1){
            return;
        }
        int[] temp=new int[a.length-1];
        for (int i = 0; i < a.length-1; i++) {
            temp[i]=a[i]+a[i+1];
        }

        sumoftri(temp);
        System.out.println(Arrays.toString(a));
    }
}
