package Oops;

public class HeraricalInheritance {
    void eat(){
        System.out.println("Eating ");
    }
   
    
}
 class Dog extends Multiple{
    void barking(){
        System.out.println("Barking");
    }

 }


 class Cat extends Multiple{
    void meo(){
        System.out.println("meo meoo");
    }

    public static void main(String[] args) {
        Multiple m= new Multiple();
        Dog d=new Dog();
        Cat c= new Cat();

        m.eat();
        System.out.println("<--------------------------->");
        d.eat();
        d.barking();
        System.out.println("<---------------------------->");
        c.eat();
        c.meo();
    }
 }
