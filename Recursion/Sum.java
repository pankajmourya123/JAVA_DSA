package Recursion;

public class Sum {
    public static void main(String[] args) {
        int n=6;
       int result= sum(n);
    //    System.out.println(result);
    //    secsum(5,0);
    }

    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n + sum(n-1);
    }


    public static void secsum(int n,int sum){
     if(n==0){
        System.out.println(sum);
        return ;
     }
     
     sum+=n;
     secsum(n-1,sum);


    }
}
