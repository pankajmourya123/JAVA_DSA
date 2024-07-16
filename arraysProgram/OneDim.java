package arraysProgram;

public class OneDim {
    public static void main(String []args) {
        int [] a={10,20,30,30,40};
        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i]+" ");
        // }
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
