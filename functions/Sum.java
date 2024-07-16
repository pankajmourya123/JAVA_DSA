package functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 =sc.nextInt();
        int sum = sum(num1, num2, num3);
        System.out.println("max number is "+sum);
    }
    static int sum( int ...vargs){
        int sum=0;
      for (int i = 0; i < vargs.length; i++) {
        sum+=vargs[i];
      }
      return sum;
    }
}
