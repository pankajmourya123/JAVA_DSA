package Recursion;

public class Getfibo {
    public static void main(String[] args) {
       int res= fibo(5);
       System.out.println(res);
    }

    public static int  fibo(int n){
if(n<=1){
    return n;
}
return fibo(n-1)+fibo(n-2);
    }
}
