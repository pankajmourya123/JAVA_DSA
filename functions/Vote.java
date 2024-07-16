package functions;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  age");
        int num1 = sc.nextInt();
        String result = Check(num1);
        System.out.println(result);
    }

    static String Check(int n){
        if(n>=18){
         return "GO vote";
     }
     else return "Go home";
}
}
