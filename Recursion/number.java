package Recursion;

public class number {
    public static void main(String[] args) {
        int n=1;
        num(1,n);
        // printnum(n);
    }
    public static void num(int i,int n){
        if(i>n){
            return;
        }
        // System.out.println(i);
        num(i+1,n);
    }
    public static void printnum(int i){
        if(i>10){
            return ;
        }
        // System.out.println(i);
        printnum(i+1);
    }
}
