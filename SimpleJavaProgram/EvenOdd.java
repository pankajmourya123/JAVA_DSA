 class Evenodd {
    public static void main(String []args) {
        int num =20;
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

        // int num = 20;
        // if ((num ^ 1) == num + 1) {
        //     System.out.println("Even");
        // } else {
        //     System.out.println("Odd");
        // }
        // XOR Operator (^):

// The XOR (^) operator in Java can be used to toggle bits. Specifically, num ^ 1 flips the least significant bit of num.
// For even numbers (num), the least significant bit (LSB) is 0. XORing num with 1 flips this bit to 1, resulting in num ^ 1 being equal to num + 1.
// For odd numbers, the LSB is 1. XORing num with 1 flips this bit to 0, making num ^ 1 equal to num - 1.
    }
}
