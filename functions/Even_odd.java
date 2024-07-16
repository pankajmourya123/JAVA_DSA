package functions;

import java.util.Scanner;

import Oops.Check;

public class Even_odd {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter  number");
    int num1 = sc.nextInt();
    String result = Check(num1);
    System.out.println(result);
   } 

   static String Check(int n){
      if(n%2==0){
        return "EVEN";
      }else return "odd";
   }
}
