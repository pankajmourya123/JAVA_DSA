import java.util.Scanner;

class SumOfTwoPrime {
    public static void main(String[] arg) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a number");
        int num = sc.nextInt();
        boolean flag = false;

        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i)) {
                if (isPrime(num - i)) {
                    flag = true;
                    System.out.printf(" %d = %d + %d\n", num, i, num - i);
                }
            }
        }
        if (!flag) {
            System.out.println("did not find sum");
        }
    }

    public static boolean isPrime(int num) {
        boolean prime = true;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
