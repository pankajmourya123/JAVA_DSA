import java.util.Scanner;

class ReverseRecursion {
    static int rem,rev=0;
    public static void main(String []args) {
        Scanner sc = new Scanner((System.in));
        int num = sc.nextInt();
        ReverseRecursion obj=new ReverseRecursion();
        obj.Rev(num);
        System.out.println(rev);
    }
    void Rev(int num){
        while(num!=0){
        rem=num%10;
        rev=rev*10+rem;
        num=num/10;
        
        }
       
    }
}
