package Oops;

class employee {
    private int emid;

    void setid(int emid1) {
        emid = emid1;
    }

    int getid() {
        return emid;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        employee e = new employee();
        e.setid(101);
        System.out.println(e.getid());
    }
}
