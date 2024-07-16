public class pattrens {
    public static void main(String[] args) {
        // pattern1(4);
        // pattern2(4);
        // pattern3(4);
        // pattern4(4);
        // pattern5(5);
        // pattern6(5);
        // pattern7(5);
        // pattern8(5);
        // pattern9(5);
        // pattern10(5);
        // pattern11(5);
        // pattern12(5);
        pattern13(5);

    }

    static void pattern1(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();

        }
    }

    static void pattern5(int n) {
        for (int row = 1; row <= 2 * n - 1; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 1; col <= totalColsInRow; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern6(int n) {
        for (int row = 1; row <= n; row++) {
            int space = n - row;
            for (int sapces = 1; sapces <= space; sapces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            // int space= n-row;
            for (int sapces = 1; sapces <= row; sapces++) {
                System.out.print(" ");
            }
            for (int col = n; col >= row; col--) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern8(int n) {
        for (int row = 1; row <= n; row++) {
            // int space= n-row;
            for (int sapces = 1; sapces <= n - row; sapces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern9(int n) {
        for (int row = 1; row <= n; row++) {
            // int space= n-row;
            for (int sapces = 1; sapces <= row; sapces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2 * (n - row) + 1; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern10(int n) {
        for (int row = 1; row <= n; row++) {
            int space = n - row;
            for (int sapces = 1; sapces <= n - row; sapces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern11(int n) {
        for (int row = 1; row <= n; row++) {
            int space = row;
            for (int sapces = 1; sapces <= space; sapces++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    static void pattern12(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern13(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i > 1) {
                for (int k = 1; k <= 2 * (i - 1) - 1; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        }
    }


