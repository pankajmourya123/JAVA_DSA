package arraysProgram;

public class secondLargestway1 {
    public static void main(String[] args) {
        int[] a = { 12, 32, 34, 54, 43, 32, 12, 10 };
        int temp = 0;
        for (int i = 0; i < a.length; i++) {
            // for (int j = i+1; j < a.length; j++) {
            // if(a[i]<a[j]){
            // temp=a[i];
            // a[i]=a[j];
            // a[j]=temp;
            // }
            // }
            // System.out.print(a[i]+" ");

            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
            if (i == 1) {
                break;
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println(a[1]);
    }

}
