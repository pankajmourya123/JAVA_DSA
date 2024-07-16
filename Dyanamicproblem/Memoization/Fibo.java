package Dyanamicproblem.Memoization;

import java.util.ArrayList;
import java.util.Collections;

public class Fibo {
    public static void main(String[] args) {
        int res = fibo(3);
        System.out.println(res);
    }

    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        ArrayList<Integer> dp = new ArrayList<>(Collections.nCopies(n + 1, -1));
        return solve(n, dp);
    }

    public static int solve(int n, ArrayList<Integer> dp) {
        if (n <= 1) {
            return n;
        }

        if (dp.get(n) != -1) {
            return dp.get(n);
        }

        int fibNMinus1 = solve(n - 1, dp);
        int fibNMinus2 = solve(n - 2, dp);
        
        dp.set(n, fibNMinus1 + fibNMinus2);  

        return dp.get(n);
    }
}
