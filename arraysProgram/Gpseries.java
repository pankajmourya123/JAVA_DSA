package arraysProgram;

public class Gpseries {
    public static void main(String[] args) {
        int n = 10;    
        int a1 = 1;     
        int r = 2;      

        for (int i = 1; i <= n; i++) {
            int nthTerm = (int) (a1 * Math.pow(r, i - 1));
            System.out.print(nthTerm + " ");
        }
    }
}

// int r = a2 / a1;
// // Calculate the nth term using the formula
// int nthTerm = a1 * power(r, n - 1);