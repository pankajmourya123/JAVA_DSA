package Recursion;

public class xpowern {
    public static void main(String[] args) {
        int x=2;
        int n=5;
       int result= power(2,5);
       System.out.println(result);
    }
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xremn=power(x, n-1);
        return xremn*x;
    }
}
