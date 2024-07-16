import java.util.Scanner;

class Switch {
public static void main(String []args) {
       String yn;                 
  do {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int num1=sc.nextInt();
    System.out.println("enter second number");
  int num2=sc.nextInt();
    System.out.println("choose one (+ ,- ,/ ,*)");
    String symbol=sc.next();
    switch (symbol) {
        case "+": 
            System.out.println(num1+num2);
            break;
            case "-": 
            System.out.println(num1-num2);
            break;
            case "/": 
            System.out.println(num1/num2);
            break;
            case "*": 
            System.out.println(num1*num2);
            break;
        default:
        System.out.println("invalid input");
            break;
    }
    System.out.println("press y for continue and no for exsist");
    yn=sc.next();
  } while (yn.equals("y") || yn.equals("Y"));
} 
}
