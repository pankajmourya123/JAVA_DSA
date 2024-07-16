import java.util.Scanner;

public class Threerange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please any number");
        int n=sc.nextInt();
       
       int count = 0;
        
      
        for (int i = 2; i <= n; i++) {
            int num = i;
            
            
            while (num > 0) {
                if (num % 10 == 3) {
                    count++;
                }
                num = num / 10;
            }
        }
        
       System.out.println(count);
       
    }
   
}
       
    
    

