package String;

import java.util.Scanner;

public class palidromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print(" Enter a string : ");
        String s = sc.next();
        int len = s.length();
        String str = "";
        for (int i = len - 1; i >= 0; i--) {
            str = str + s.charAt(i);

        }
        System.out.println(str);
       if(str.equals(s)){
        System.out.println("palidromed ");
       }
       else{
        System.out.println("not palidrome");
       }
    }
}