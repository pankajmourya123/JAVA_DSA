package Recursion;

public class Sumofdigit {
    public static void main(String[] args) {
        int n=12345;
    int res=sumdigit(n);
    System.out.println(res);
    }
    public static int sumdigit(int i){
        if(i==0){
            return 0;
        }
        int rem=i%10;
        return rem+sumdigit(i/10);
    }
}
