 import java.util.Scanner;
 
 class Fibonacci {
public static void main(String []args) {
    int a=0,b=1,c;
    Scanner sc = new Scanner((System.in));
        System.out.print("Enter last number ");
        int last = sc.nextInt();
        System.out.print(a+" "+b);
    for(int i=2;i<=last;i++){
        c=a+b;
        System.out.print(" "+c);
        a=b;
        b=c;
        if(i==last){
            System.out.println(c);
        }
    }

    
}    
}
