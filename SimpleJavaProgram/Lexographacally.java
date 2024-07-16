import java.util.Scanner;

public class Lexographacally {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = "hello";
        String B = "java";
        int totallength = A.length() + B.length();
        System.out.println(totallength);
        int flag = A.compareTo(B);
        if (flag < 0) {
            System.out.println("No");
        } else {
            System.out.println("yes");
        }

        String s1 = A.substring(0, 1);
        String rems1 = A.substring(1, A.length());
        s1 = s1.toUpperCase();
        String A1 = s1 + rems1;

        String s2 = B.substring(0, 1);
        String rems2 = B.substring(1, B.length());
        s2 = s2.toUpperCase();
        String B1 = s2 + rems2;

        System.out.println(A1 + " " + B1);

    }
}
