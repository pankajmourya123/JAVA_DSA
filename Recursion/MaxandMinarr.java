package Recursion;

public class MaxandMinarr {
    public static void main(String[] args) {
        int[] a = {89, 2, 3, 4, 5};
      int mi=  minele(a,a.length-1);
      int mx=  maxele(a,a.length-1);
      System.out.println(mi);
      System.out.println(mx);
    }
    public static int minele(int[] a,int n){
        if(n==0){
            return a[n];
        }

        int temp=a[n];
        return Math.min( temp,minele(a, n-1));

    }

    public static int maxele(int[] a,int n){
        if(n==0){
            return a[n];
        }

        int temp=a[n];
        return Math.max( temp,maxele(a, n-1));

    }
}
