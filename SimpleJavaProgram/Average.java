import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
       Scanner s =new Scanner(System.in);
       System.out.println("Enter num of number");
     int num= s.nextInt();
    int []a =new int[num];
    for (int i = 0; i < a.length; i++) {
        a[i]=s.nextInt();
    }
    int sum=0;
    for (int i = 0; i < a.length; i++) {
         sum=sum+a[i];
    }
    System.out.println(sum/5);
       

    }
}
