package functions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  number");
        int num1 = sc.nextInt();
        int result = Check(num1);
    if(result==1){
        System.out.println("Prime NUMBER");
    }
    if(result==0){
        System.out.println("not prime");
    }
    }

    static int Check(int n){
      int count=0;
      for (int i = 1; i <n/2; i++) {
        if(n%i==2){
         count++;
        }
       
       
      }
      if(count>0){
        return 0;
       }else return 1;
 
}
}
