package Recursion;

public class number1 {
    public static void main(String[] args) {
        // print 1 to 10 without using i+1 (backtarcking)
        int n=10;
        // num(n,n);
        printnum(n);

    }
    public static void num(int i ,int n){
        if(i<1){
            return;
        }
        num(i-1, n);
        System.out.println(i); 
    }
    public static void printnum(int i){
        if(i==0){
            return;
        }
        System.out.println(i);
        printnum(i-1);
    }
}
