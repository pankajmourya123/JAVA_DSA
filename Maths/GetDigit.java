package Maths;

public class GetDigit {
    public static void main(String[] args) {
        int i = 3; 
        int num=8;
        int mask = 1 << i;
        // System.out.println(mask);
        int result=  (num&mask)>>i;
        System.out.println(result);
        

    
    }
}
