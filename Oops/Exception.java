package Oops;

import java.io.FileInputStream;

public class Exception {
    public static void main(String[] args) {
        //checked exception //program will not complie // warn by complier // occur at runtime time 
        // FileInputStream fis= new FileInputStream("d:/acb.txt");
        // Class.forName("com.mysql.jdbc.Driver");
// String name =null;
// System.out.println(name.length());

//unchecked exception  //program wiil compile  // deos not warn by complier // occur at runtime time
int a=100,b=0,c;
c=a/b;
System.out.println(c);
//we wiii use try catch to resolve

        
    }
}
