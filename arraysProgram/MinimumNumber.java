package arraysProgram;

public class MinimumNumber {
    
    public static void main(String[] args) {
        int[] arr = { 21, 32, 45, 43, 21, 23, 11, 1 };
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
