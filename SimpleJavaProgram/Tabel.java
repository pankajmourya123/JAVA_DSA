import java.util.Scanner;

class Tabel {
public static void main(String []xyz) {
   Scanner sc = new Scanner((System.in));
   System.out.println("enter the number ");
   int num = sc.nextInt();
   for(int i=1;i<=10;i++){
    System.out.println(num +" * "+ i +"="+ num*i);
   }
}    
}
