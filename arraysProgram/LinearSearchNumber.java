package arraysProgram;

public class LinearSearchNumber {
    public static void main(String[] args) {
        int[] arr = { 21, 12, 32, 54, 45, 54, 33 };
        int temp = 0;
        int item = 33;
        for (int i = 0; i <arr.length; i++) {
            if (item == arr[i]) {
                System.out.println(item + " is found at index " + i);
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.print(item + " is not found ");
        }
    }
}
