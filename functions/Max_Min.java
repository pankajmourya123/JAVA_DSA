package functions;

import java.util.Scanner;

public class Max_Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = max(num1, num2, num3);
        System.out.println("max number is "+max);
        int min=min(num1,num2,num3);
        System.out.println("min number is "+min);
    }

    static int max(int n1, int n2, int n3) {
        if (n1 > n2) {
            if (n1 > n3) {
                return n1;
            } else {
                return n3;
            }
        } else if (n2 > n3) {
            return n2;
        } else {
            return n3;
        }

    }

    static int min(int n1, int n2, int n3) {
        if (n1 < n2) {
            if (n1 < n3) {
                return n1;
            } else {
                return n3;
            }
        } else if (n2 < n3) {
            return n2;
        } else {
            return n3;
        }

    }
}
