package arraysProgram;

public class kthLargestNumber {
    public static void main(String[] args) {
        int[] a = { 32, 23, 45, 54, 32, 22, 11, 65, 75 };
        int k = 4;
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }

            }
            if (i == k - 1) {
               
                System.out.println(k+"th largest element is "+a[i]);
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }


    }
}
