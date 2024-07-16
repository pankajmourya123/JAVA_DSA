package functions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("enter  number");
            int num1 = sc.nextInt();
            int result = Check(num1);
            System.out.println(result);
           
        
    }
    
    static int Check(int n){
        int fact=1;
        for (int i = 1; i <=n; i++) {
            fact=fact*i;
        }
        return fact;
     }
}
