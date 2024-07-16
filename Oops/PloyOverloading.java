package Oops;

public class PloyOverloading {
  
// void show(int a){
//     System.out.println("1");
// }
//    void show(String a){
//     System.out.println("2");
//    } 

//    public static void main(String[] args) {
//     PloyOverloading ov=new PloyOverloading();
//     ov.show("c");//here passing char but argument is string then also run here comes concept of Automatic Promotion
//     ov.show(55);
//    }


// void show(Object a){
//     System.out.println("object method");
// }
//    void show(String a){
//     System.out.println("string method");
//    } 

//    public static void main(String[] args) {
//     PloyOverloading ov=new PloyOverloading();
//     ov.show("caa");//compler always give precedence for the child type argument than compared with parent type argument
  
//    }



// void show(StringBuffer a){
//     System.out.println("object method");
// }
//    void show(String a){
//     System.out.println("string method");
//    } 

//    public static void main(String[] args) {
//     PloyOverloading ov=new PloyOverloading();
//     ov.show("caa");
//     ov.show(new StringBuffer("xyz"));
//     // ov.show(null); string and stringbuffer are at same level so "null" cannot be refferd ,if refered ambigiouserror will occur.
//    }



// void show(int a,float b){
//     System.out.println("int float method");
// }
//    void show(float a,int b){
//     System.out.println("float int  method");
//    } 

//    public static void main(String[] args) {
//     PloyOverloading ov=new PloyOverloading();
//     ov.show(5,5.5f);
//     ov.show(5.3f, 8);
//     ov.show(2,5);
  
//    }


void show(int a){
    System.out.println("object method");
}
   void show(int... a){
    System.out.println("string method");
   } 

   public static void main(String[] args) {
    PloyOverloading ov=new PloyOverloading();
    ov.show();
    ov.show(5,6,8);
  
   }

}
