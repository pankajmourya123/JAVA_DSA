package functions;

import java.util.Scanner;

public class palidrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  number");
        int num1 = sc.nextInt();
        int result = Check(num1);
if(result==1){
    System.out.println("palidrome ");
}
else{
    System.out.println("not palidrome ");
}
    }

    static int Check(int n){
        int num=n;
        int rem=0;
        int rev=0;
       while(n!=0){
    rem=n%10;
    rev=rev*10+rem;
    n=n/10;
       }
       System.out.println(rev);
     if(rev==num){
        return 1;
     }
     else return 0;
}
}