package arraysProgram;

import java.util.Arrays;

public class Shuffled {
    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = nums.length / 2;
        int[] shuffled = new int[nums.length];
        for (int i = 0; i < n; i++) {
            shuffled[2*i] = nums[i];
            
            shuffled[2*i+1] = nums[i+n];
        }
        System.out.println(Arrays.toString(shuffled));
    }
}
