
package Oops;
// 1 this keyword is used to invoke current class instance variable

import java.time.chrono.ThaiBuddhistChronology;

// class ThisKeyword {
//     int i;

//     void setVlue(int i) {
//         // i = i;// here it willl 0 output
//         this.i=i;//here 100
//     }

//     void show() {
//         System.out.println(i);
//     }

//     public static void main(String[] args) {
//         ThisKeyword tk=new ThisKeyword();
//         tk.setVlue(100);
//         tk.show();
//     }
// }

// this keyword can be used to invoke current classs method 

// class ThisKeyword {
//     void display() {
//         System.out.println("1234567890");
//     }

//     void show() {
//         this.display();// this is = display(); if we not this then compiler by itself add this
//     }

//     public static void main(String[] args) {
//         ThisKeyword t = new ThisKeyword();

//         t.show();
//     }
// }

//  3. this keyword can be used to invoke current class construtor

// class ThisKeyword{
//     ThisKeyword(){
//         System.out.println("qwghjhgfdsakjhgfw");
//     }

//     ThisKeyword(int a){
//         this();
//         System.out.println("54655465665656868565");
//     }

//     public static void main(String[] args) {
//         ThisKeyword td =new ThisKeyword(5);
//     }
// }

// 4.this keyword can be used to pass as an argument int the method call

// class ThisKeyword{
//     void m1(ThisKeyword td){
//         System.out.println("5444444");
//     }

//     void m2(){
//         m1(this);
//     }

//     public static void main(String[] args) {
//         ThisKeyword t =new ThisKeyword();
//         t.m2();
//     }
// }

// 5.this keyword can be used pass as an argument in  the constructor call
// 6.this keyword can be used to return the current class instance from the method