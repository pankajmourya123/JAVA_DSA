package java8feature;

// interface Interf {
//     public int square(int x);
// }

// class Demo implements Interf {
//     public int square(int x) {
//         return x * x;
//     }
// }

// class Test {
//     public static void main(String[] args) {
//         Interf i = new Demo();
//         System.out.println("The Square of 7 is: " + i.square(7));
//     }
// }



 interface Interf {   
         public int square(int x);   
 }   
 class Test {   
           public static void main(String[] args) {   
                     Interf i = x -> x*x;   
                     System.out.println("The Square of 5 is:"+i.square(5));   
            }   
 }   