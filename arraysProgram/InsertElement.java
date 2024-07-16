package arraysProgram;

public class InsertElement {
    public static void main(String[] args) {
        int[] a = { 10,  30, 40, 50, 60 };
        // int Pos = 3;//where pos is given not index
        // int Element = 100;
        // for (int i = a.length - 1; i > Pos-1; i--) {
        //     a[i] = a[i - 1];

        // }
        // a[Pos - 1] = Element;
        // for (int i : a) {
        //     System.out.print(i+" ");
        // }
        int index = 3;//where is given  index
        int Element = 100;
        for (int i = a.length - 1; i > index; i--) {
            a[i] = a[i - 1];

        }
        a[index ] = Element;
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
