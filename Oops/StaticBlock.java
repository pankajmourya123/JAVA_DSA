package Oops;

public class StaticBlock {
    static{
        System.out.println("helloo");
    }
    public static void main(String[] args) {
        System.out.println("world");
    }

    static{
        System.out.println("kya be lavde");
    }
}
