package Oops;

class Kick {
    int emp_id;
    String name;
   static  String company="sp";

    Kick(int empid, String name) {
        this.emp_id = empid;
        this.name = name;
       
    }

    void display() {
        System.out.println(emp_id + " " + name + " " + company);
    }
   

}


class StaticKey{
    public static void main(String[] args) {
        Kick e1 = new Kick(101, "amit");
        e1.display();
        Kick e2 = new Kick(102, "ajay");
        e2.display();
        Kick e3 = new Kick(103, "pankaj");
        e3.display();
    }
}
