import java.util.Scanner;
 
 class FibonacciRecursion {
    static int a=0,b=1,c;
public static void main(String []args) {
  Scanner sc = new Scanner((System.in));
  System.out.println("enter a last number");
       int num = sc.nextInt();
       System.out.println(a+" "+b);
        FibonacciRecursion obj=new FibonacciRecursion();
        obj.Fibo(num);
}    
void Fibo(int num){
    if(num>=1){
        c=a+b;
        System.out.println(c);
        a=b;
        b=c;
        Fibo(num-1);
    }
}
}
