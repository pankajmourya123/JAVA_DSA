package Recursion;

public class revernumber {
    public static void main(String[] args) {
        int num=123;
          revernum(num);
    }
    public static void revernum(int num){
        // if(num==0){
        //     return;
        // }
        // int rem =num%10;
        
        // System.out.print(num);
        // revernum(num/10);

        if (num == 0) {
            return;
        }
        int rem = num % 10;
        System.out.print(rem);
        revernum(num / 10);
    }
}
