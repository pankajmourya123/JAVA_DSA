package arraysProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AllsubArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        // oneMethod(arr,arr.length-1);
        int n = arr.length - 1;
        oneMethod(arr, n);
        // twoMethod(arr, n);
        // threeMethod(arr, n);
    }

// Purpose: This method generates all possible subarrays of the input array arr.
// Usage: Use this method when you need to enumerate or work with all subarrays of an array. It's useful for tasks like finding specific patterns within subarrays or analyzing all possible subsets of data.
    static List<List<Integer>> Method(int[] arr, int n) {
        List<List<Integer>> subarrays = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                List<Integer> subarray = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    subarray.add(arr[k]);
                }
                subarrays.add(subarray);
            } 
        }

        return subarrays;
    }

// Description:

// Purpose: This method computes the maximum sum of any contiguous subarray using a brute-force approach.
// Usage: It's suitable for small arrays or as an initial implementation to understand the problem. However, it has a time complexity of O(n^3), making it inefficient for large arrays
    static void oneMethod(int[] arr, int n) {
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                maxsum = Math.max(sum, maxsum);
            }

        }
    }

    

// Purpose: This method finds the maximum sum of any contiguous subarray using a cumulative sum approach.
// Usage: It improves efficiency to O(n^2), where n is the size of the array, by precomputing cumulative sums. This method is suitable for larger arrays compared to the brute-force

    static void twoMethod(int[] arr, int n) {
        int[] cumsum = new int[n + 1];
        cumsum[0] = 0;
        // {1,2,3,4,5};
        for (int i = 1; i <= n; i++) {
            cumsum[i] = cumsum[i - 1] + arr[i - 1];
        }
        System.out.println(Arrays.toString(cumsum));

        int maxSum = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            maxSum = Math.max(maxSum, cumsum[i]);
            for (int j = 1; j <= i; j++) {
                sum = cumsum[i] - cumsum[j - 1];
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);

    }
    
    // Purpose: This method uses Kadane's algorithm to find the maximum sum of any contiguous subarray efficiently.
    // Usage: Kadane's algorithm is optimal with a time complexity of O(n), making it suitable for large arrays. It handles both positive and negative numbers and guarantees finding the maximum sum subarray.
    static void threeMethod(int[] arr, int n) {
        int cursum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            cursum += arr[i];
            if (cursum > maxSum) {
                maxSum = cursum;
            }
            if (cursum < 0) {
                cursum = 0;
            }
        }

        System.out.println(maxSum);

    }

}
