package arraysProgram;

public class Apseries {
    public static void main(String[] args) {
        int n = 10;
        int a1 = 1; 
        int d = 1;  

        for (int i = 1; i <= n; i++) {
            int nthterm = a1 + (i - 1) * d;
            System.out.print(nthterm + " ");
        }
    }
}
// nthTerm = a1 + (n - 1) * d;
