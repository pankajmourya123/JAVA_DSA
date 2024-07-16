//  import java.util.Scanner;
 
 
//  class FactByRecursion {
//      static int fact=1;
//        public static void main(String []args) {
//         Scanner sc =new Scanner((System.in));
//         System.out.println("Enter a number");
//         int num=sc.nextInt();
//     FactByRecursion obj = new FactByRecursion();
//     obj.CaclFac(num);
//     System.out.println("factorial of "+ num +"v is = " + fact);
//    } 
//    void CaclFac(int num){
//     if(num>=1){
//         fact=fact*num;
//         CaclFac(num -1);
//     }
//    }
// }
import java.util.Scanner;

class FactByRecursion{
    public static void main(String []arg) {
        Scanner sc = new Scanner((System.in));
   System.out.println("enter a number");
        int num = sc.nextInt();
        FactByRecursion obj = new FactByRecursion();
        int fact ;
        fact = obj.ClacFac(num);
        System.out.println(fact);
    }
int ClacFac(int num){
    if(num>=1){
        return(num*ClacFac( num-1));

    }
    return 1;
}
}