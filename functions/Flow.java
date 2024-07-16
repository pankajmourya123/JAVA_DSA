package functions;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class Flow {
    public static void main(String[] args) {
      first();
      conditional();
loop();
    }

static void first(){
    System.out.println("hello world");
}

    static void loop() {
         for (int i = 0; i <5; i++) {
            System.out.println(i);
         }
    }
static  void conditional() {
    Scanner sc= new Scanner(System.in);
    int num1=sc.nextInt();
    if (num1%2==0) {
        System.out.println("even");
    } else {
        System.out.println("odd");
    }
}

}
