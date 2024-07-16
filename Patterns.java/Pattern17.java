public class Pattern17 {
    public static void main(String []args) {
        for (int i = 0; i <=5; i++) {
            for (int j = 5; j >=i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=5; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
