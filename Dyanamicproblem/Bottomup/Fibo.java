package Dyanamicproblem.Bottomup;

public class Fibo {
    public static void main(String[] args) {
     
       System.out.println(fibo(6));
    }

    public static int fibo(int n){
   if(n<=1){
    return n;
   }
int []  t=new int[n+1];
    t[0]=0;
    t[1]=1;

    for (int i = 2; i <=n; i++) {
        t[i]=t[i-1]+t[i-2];
    }
      return t[n];
    }
}
