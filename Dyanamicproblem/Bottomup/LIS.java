package Dyanamicproblem.Bottomup;

import java.util.Arrays;

public class LIS {
 public static void main(String[] args) {
    int [] nums= {10, 9, 2, 5, 3, 7, 101, 18};
    LongestIncreasingSubs(nums);
 }   

 public static int LongestIncreasingSubs(int [] nums){
    int n=nums.length;
    int [] t=new int[n];
    Arrays.fill(t,-1);
      int maxL=1;
    for (int i = 0; i < t.length; i++) {
        for (int j = 0; j < t.length; j++) {
            if(nums[j]<nums[i]){
                t[i]=Math.max(t[i], t[j]+1);
                 maxL=Math.max(maxL, t[i]);
            }
        }
    }
    return maxL;
 }
}
