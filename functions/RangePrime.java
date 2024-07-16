package functions;

import java.util.Scanner;

public class RangePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start= sc.nextInt();
        int end= sc.nextInt();
       isprime(start,end);

    }
    static void isprime(int n,int n2){
        for (int i = n; i <= n2; i++) {
          int temp=0;
          
            for (int j = 2; j <= i/2; j++) {
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

