package Oops;

 class Multiple {
    void eat(){
        System.out.println("Eating ");
    }
   
    
}
 class Dog extends Multiple{
    void barking(){
        System.out.println("Barking");
    }

 }


 class Cat extends Dog{
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
        c.barking();
        c.meo();
    }
 }