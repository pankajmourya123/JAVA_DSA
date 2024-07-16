import java.util.Scanner;

class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter last number");
        int last = sc.nextInt();
        int temp = 0;
        for (int i = 1; i <= last; i++) {
            if (i == 1 || i == 0)
                continue;
          
              for (int j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.println(i);
            } else {
                temp = 0;
            }

        }
    }
}
