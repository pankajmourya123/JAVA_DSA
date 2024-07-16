package arraysProgram;

public class SubsequenceArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] newArr = new int[arr.length];
        int idx = 0;
        allSubseq(arr, newArr, idx);
    }

    public static void allSubseq(int[] arr, int[] newArr, int idx) {
        if (idx == arr.length) {
            printArray(newArr, idx);
            return;
        }
// 420891697436784
       
        newArr[idx] = arr[idx];
        allSubseq(arr, newArr, idx + 1);

        newArr[idx] = 0;  
        allSubseq(arr, newArr, idx + 1);
    }

    public static void printArray(int[] arr, int len) {
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("]");
    }
}

