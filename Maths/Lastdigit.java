package Maths;

public class Lastdigit {
    public static void main(String[] args) {
        int num=3;
        System.out.print(digit(num));
    }

    static int digit(int n){
        return (n&1);
    }
}
