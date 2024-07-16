
// Problem Statement:
// You are given a grid of size 
// m×n. You are initially at the top-left cell 
// (0,0) and you want to reach the bottom-right cell 
// (m−1,n−1). You can only move either right or down at each step. You need to find the number of unique paths from the top-left cell to the bottom-right cell.
package Recursion;

public class Countpath {
    public static void main(String[] args) {
        int m=3, n=3;
       int res= countpath(0,0,m,n);
       System.out.println(res);
    }
    public static int countpath(int i,int j,int m,int n){
        if(i == m-1 || j == n-1) {
            return 1;
        }
 
 
        return countpath(i+1, j, m, n) + countpath(i, j+1, m, n);
}
    }

