 import java.util.Scanner;
 
 
 class Prime {
    public static void main(String []args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int temp=0;
        boolean flag=true;
        for(int i=2;i<=num-1;i++){
        if(num%i==0){
           flag=false;
        }
        }
        if(!flag){
            System.out.println(" not prime number");
        }
        else{
            System.out.println(" prime number");
        }
    }
}
