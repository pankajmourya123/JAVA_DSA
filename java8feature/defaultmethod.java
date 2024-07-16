package java8feature;
interface Left{
    default void m1(){
        System.out.println("Left");
    }
}

interface Right{
    default void m1(){
        System.out.println("right");
    }
}
public class defaultmethod implements Left ,Right{
    public void m1(){
        // System.out.println("test");
        Left.super.m1();
    }
    public static void main(String[] args) {
                new defaultmethod().m1();
    }
}
