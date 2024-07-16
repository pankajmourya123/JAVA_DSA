package Oops;

public class FlowOfTryCatch {
    public static void main(String[] args) {
        // when no exception occur
    //     System.out.println("1");
    //      try {
    //         System.out.println("2");
    //         int a=100,b=2,c;
    //         System.out.println("3");
    //         c=a/b;
    //         System.out.println("4");
    //         System.out.println(c);
    //         System.out.println("5");
    //     } catch (Throwable e) {
    //         System.out.println("6");
    //     System.out.println(e);
    //     System.out.println("7");
    //     }
    // System.out.println("Hello");

    // when exception occur
    System.out.println("1");
    try {
       System.out.println("2");
       int a=100,b=0,c;
       System.out.println("3");
       c=a/b;
       System.out.println("4");
       System.out.println(c);
       System.out.println("5");
   } catch (Throwable e) {
       System.out.println("6");
   System.out.println(e);
   System.out.println("7");
   }
System.out.println("Hello");

    }
}
