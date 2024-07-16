import java.util.Scanner;

class Palidrome {
    public static void main(String []args) {
        Scanner sc = new Scanner ((System.in));
        System.out.println("Enter a number");
        int no= sc.nextInt();
        int num=no;
        int rem,rev=0;
        while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

        }
        if(no==rev){
            System.out.println("palidrome");
        }
        else{
            System.out.println("not palidrome");
    }
}
}