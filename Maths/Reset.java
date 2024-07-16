package Maths;

public class Reset {
public static void main(String[] args) {
    int num=8;
        int i=3;
        // int mask =1<<(i-1);
        int mask2=~(1<<i);
        int result=num&mask2;
        System.out.println(result);
}
}
