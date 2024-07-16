 class Swap {
    public static void main(String []args) {
        int a=10,b=20;
//    t=a;
//    a=b;
//    b=t;
a=a+b;
b=a-b;
a=a-b;
// by using xor
//   num1 = num1 ^ num2;

//     num2 = num1 ^ num2;

//     num1 = num1 ^ num2;
   System.out.println("after swapping a "+a);
   System.out.println(b);
    }
}
