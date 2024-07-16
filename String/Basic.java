package String;

public class Basic {
    public static void main(String[] args) {
        char[] ch ={'p','u','o','o'};
        String s =new String(ch);
        System.out.println(s);



        StringBuilder sb = new StringBuilder("poiugdsdsth");
        String s1 = new String(sb);
        System.out.println(sb); 

        StringBuffer sbb = new StringBuffer("kkhnakghg");
        String s2 = new String(sbb);
        System.out.println(s2);


        byte [] b={101,102,103};
        String s5 = new String(b);
        System.out.println(s5);
    }
}
