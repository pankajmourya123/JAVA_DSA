import java.util.Scanner;
class RangePalidrome {
    public static void main(String []args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter start  number");
        int start=sc.nextInt();
        System.out.println("Enter last  number");
        int last=sc.nextInt();
        for (int i = start; i <= last; i++) {
            int rem,rev=0;
            int num=i;
            while(num!=0){
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;

            }
            if(rev==i){
                System.out.println(i);
            }
        } 
    }
}
