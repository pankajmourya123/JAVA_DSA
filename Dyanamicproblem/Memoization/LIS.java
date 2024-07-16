package Dyanamicproblem.Memoization;

import java.util.Arrays;

public class LIS {
   
    static int n;
    static int[][] memo;
    public static void main(String[] args) {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        n = nums.length;
        memo = new int[n][n + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        int result = LongestIncreasingSubs(nums, -1, 0);
        System.out.println("Length of LIS: " + result);
    }
    

    public static int LongestIncreasingSubs(int[] nums, int prev, int curr) {
        if (curr == n) {
            return 0;
        }
        int taken = 0;
        if(memo[prev][curr]!=-1){
            return memo[prev][curr];
        }

        if (prev == -1 || nums[curr] > nums[prev]) {
            taken = 1 + LongestIncreasingSubs(nums, curr, curr + 1);
        }
        int skip = LongestIncreasingSubs(nums, prev, curr + 1);
        return memo[prev][curr]=Math.max(taken, skip);
    }
}
