package Oops;

public class StaticCounter {
   static int count=0;
    StaticCounter(){
        count++;
System.out.println(count);
    }
    public static void main(String[] args) {
        StaticCounter s =new StaticCounter();
        StaticCounter s1 =new StaticCounter();
        StaticCounter s2 =new StaticCounter();
        StaticCounter s3 =new StaticCounter();
    }
}
