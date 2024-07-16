package Oops;

public class SingleInheritance {
    void eat(){
        System.out.println("Eating ");
    }
}

class Dog extends SingleInheritance{
    void barking(){
        System.out.println("fghjhgfdfghhg");
    }
    public static void main(String[] args) {
        Dog d= new Dog();
        d.eat();
        d.barking();
    }
}
