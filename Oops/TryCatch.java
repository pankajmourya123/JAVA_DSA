package Oops;

import java.io.FileInputStream;

public class TryCatch {
    public static void main(String[] args) {
        // handling checked exception
        // 1
        // try {
        // String name = null;
        // System.out.println(name.length());
        // } catch (Throwable e) {
        // System.out.println(e);
        // }
        // 2
        // try {
        // FileInputStream fis= new FileInputStream("d:/acb.txt");
        // } catch (Throwable e) {
        // System.out.println(e);
        // }

        // 3
        // try {
        // Class.forName("com.mysql.jdbc.Driver");
        // } catch (Throwable e) {
        // System.out.println(e);
        // }

        // unchecked exception
        // try {
        //     int a=100,b=0,c;
        //     c=a/b;
        //     System.out.println(c);
        // } catch (Throwable e) {
        // System.out.println(e);
        // }
    }
}
