import java.util.Scanner;

class RangeArmstrom {
    public static void main(String []args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter start  number");
        int start=sc.nextInt();
        System.out.println("Enter last  number");
        int last=sc.nextInt();
        for (int i = start; i <=last; i++) {
            // int t1 = i;
            // int leng = 0;
            // while (t1 != 0) {
            //     leng = leng + 1;
            //     t1 = t1 / 10;
            // }
  
            // int t2 = i;
            // int arm = 0;
            // int rem;
            // while (t2 != 0) {
            //     int mul = 1;
            //     rem = t2 % 10;
            //     for (int j = 1; j <= leng; j++) {
            //         mul = mul * rem;
            //     }
            //     arm = arm + mul;
            //         t2 = t2 / 10;
            // }
            int  originalNumber, remainder, arm = 0;

            originalNumber = i;
        
            while (originalNumber != 0)
            {
                remainder = originalNumber % 10;
                arm += Math.pow(remainder, 3);
                originalNumber /= 10;
            }
        
        if(arm==i){
System.out.println(arm+" ");
            }
        }
    }
}
