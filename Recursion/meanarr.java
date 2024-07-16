package Recursion;

public class meanarr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        double mean = calculateMean(arr, n);
        System.out.println("Mean of the array elements: " + mean/n);
    }

    public static double calculateMean(int[] arr, int n) {
        
        if (n == 0) {
            return 0;
        }
        
        double sum = arr[n - 1] + calculateMean(arr, n - 1);
        
       
        return (double) sum ;
    }
}
