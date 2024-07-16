package java8feature;

// public class methodreference {
//     public static void main(String[] args) {
//         Runnable r=()->{
//             for (int i = 0; i < args.length; i++) {
//                 System.out.println(i);
//             }
//         };
//         Thread t=new Thread(r);
//         t.start();
//         for (int i = 0; i < args.length; i++) {
//             System.out.println("k");
//         }
//     }
// }


// public class methodreference {
//     public static void m1(){
// for (int i = 0; i <5; i++) {
//                 System.out.println(i);
//             }
//     }
//     public static void main(String[] args) {
//         Runnable r=methodreference::m1;
//         Thread t=new Thread(r);
//         t.start();
//         for (int i = 0; i < args.length; i++) {
//             System.out.println("k");
//         }
//     }
// }


interface Interf {   
        public void m1(int i);   
  }   
 class Test {   
         public void m2(int i) {   
                 System.out.println("From Method Reference:"+i);   
        }   
         public static void main(String[] args) {   
               Interf  f = i ->System.out.println
               ("From Lambda Expression:"+i);   
               f.m1(10);   
               Test t = new Test();   
               Interf i1 = t::m2;   
               i1.m1(20);   
        }   
 }   
 