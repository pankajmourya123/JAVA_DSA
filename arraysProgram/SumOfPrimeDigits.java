package arraysProgram;

import java.util.ArrayList;

public class SumOfPrimeDigits {
    public static void main(String[] args) {
        int number = 1232;
        int sumOfPrimeDigits = 0;

        
        String numStr = String.valueOf(number);
        int length = numStr.length();

       
        for (int start = 0; start < length; start++) {
            for (int end = start + 1; end <= length; end++) {
                String substr = numStr.substring(start, end);
                int digit = Integer.parseInt(substr);

             
                if (isPrime(digit)) {
                    sumOfPrimeDigits += digit;
                }
            }
        }

        System.out.println("Sum of prime digits of 123 is: " + sumOfPrimeDigits);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


}
