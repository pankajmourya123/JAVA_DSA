import java.util.Scanner;

class Factorial {
    public static void main(String []args) {
        Scanner sc = new Scanner((System.in));
        int no, fact = 1;
        System.out.println("Enter a number");
        no = sc.nextInt();
        for (int i = 1; i <= no; i++) {
            fact = fact * i;
        }
        // for(int i=no;i>=1;i--){
        //     fact=fact*i;
        // }
        System.out.println("factorial of " + no + "=" + fact);
    }
}
