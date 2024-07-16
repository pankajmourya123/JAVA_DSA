package Oops;
//1.calling static same we class we did not classname as well

// public class StaticMethod {
//  static  void show(){
//     System.out.println("56789");
//    } 
//    public static void main(String[] args) {

//     show();
//    }
// }

// 2.calling static method we need classname.methodname

// class Thik{
//     static void thikhai(){
//         System.out.println("234567");
//     }
// }
// public class StaticMethod {

//       public static void main(String[] args) {

//   Thik.thikhai();
//       }
//    }

// 3.static only access only static data it cannot access non-static data

// public class StaticMethod {
// // int i=90; //error ayaa
// static int i=90;
//     static  void show(){
//        System.out.println(i);
//       } 
//       public static void main(String[] args) {

//        show();
//       }
//    }

//4 can call only static methods and cannot call a non-static method

// public class StaticMethod {

//     // void show2() {
//     //     System.out.println("pankaj");
//     // }

//     static void show2() {
//         System.out.println("pankaj");
//     }

//     static void show() {
//         show2();

//     }

//     public static void main(String[] args) {

//         show();
//     }
// }

//5.static method cannot refer to "this or "super" keyword in anyway

// class StaticMethod{
//     int i=90;
//     static void show(int i){
//         System.out.println(this.i);
//         System.out.println(i);
//     }
// }