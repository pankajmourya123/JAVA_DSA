package Maths;

public class Set {
    public static void main(String[] args) {
        int num=12;
        int i=1;
        int mask =1<<i;
        int result=num|mask;
        System.out.println(result);
    }
}
