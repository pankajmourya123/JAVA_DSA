package Oops;
// 1.super keycan be used to refer immediateb parent class instance variable
//  class SuperKeyword {
//     int i=80;
// }


// class B extends SuperKeyword{

//     int i=90;
//     void show(int i){
//         System.out.println(i);
//         System.out.println(this.i);
//         System.out.println(super.i);
//     }
//     public static void main(String[] args) {
//         B ob = new B();
//   ob.show(8);
//     }
// }
// 2.super keyword can be used to invoke immediate parent class method
// class A{
//  void m1(){
//         System.out.println("123456");
//     }
// }

// class B extends A{
//   public  void m1(){
//         System.out.println("oiuytr");
//     }
// void show(){
//     m1();
//     super.m1();
// }
// public static void main(String[] args) {
//     B ob = new B();
//     ob.show();
// }
// }

// 3. super can be used to invoke immediateparent class constructor

class A{
    A(){
        System.out.println("class A");
    }
}

class B extends A{
    B(){
        super();//yaha par hum super() keyword use nahi kare toh complier by default laga detaa 
        System.out.println("i am class B");
    }

    public static void main(String[] args) {
        B ob =new B();
        
    }
}