// Problem Statement:
// You are given a rectangular floor of size n×m, where 
//  where n is the length and 
// m is the width. You need to find the number of ways to tile the floor using tiles of size 1×m. You can rotate the tiles if necessary."

package Recursion;

public class Tillingproblem {
    public static int placeTiles(int n, int m) {
        if(n < m) {
            return 1;
        } else if(n == m) {
            return 2;
        }
 
 
        return placeTiles(n-1, m) + placeTiles(n-m, m);
    }
 
 
    public static void main(String args[]) {
        int n = 4, m = 4;
        System.out.println(placeTiles(n, m));
    }
 
}
