package Recursion;

public class Tribonnaci {
    public static void main(String[] args) {
      System.out.println(solve(5));
    }

    public static int solve(int n){
   if(n==0){
    return 0;
   }
   if(n==1||n==2){
    return 1;
   }

   int a=solve(n-1);
   int b=solve(n-2);
   int c=solve(n-3);

   return a+b+c;
    }
}