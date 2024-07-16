package arraysProgram;

public class LargestNumber {
    public static void main(String[] args) {
        int[] arr = { 21, 32, 45, 43, 21, 23, 11, 1 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
