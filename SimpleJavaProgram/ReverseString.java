import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

class ReverseString {
    public static void main(String []args) {
      Scanner sc = new Scanner((System.in));
      System.out.println("Please enter your name");
      String name=sc.next();
      String rev=" ";
      int leng=name.length();
       for(int i=leng-1;i>=0;i--){
        rev=rev+name.charAt(i);
       }
       System.out.println(rev);
    }
}
