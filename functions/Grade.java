package functions;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  number");
        int num1 = sc.nextInt();
        String result = Check(num1);
        System.out.println(result);
    }

    static String Check(int n) {
        if (n >= 91 && n <= 100) {
            return "AA";
        } else if (n >= 81 && n <= 90) {
            return "AB";
        } else if (n >= 71 && n <= 80) {
            return "BB";
        } else if (n >= 61 && n <= 70) {
            return "BB";
        } else if (n >= 51 && n <= 60) {
            return "CB";
        } else if (n >= 41 && n <= 50) {
            return "DD";
        }
        else return "fail";
    }
}
