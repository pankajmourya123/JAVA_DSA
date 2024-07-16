package String;

import java.util.*;
import java.util.function.Function;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print(" Enter a string : ");
        String s=sc.next();
  int len =s.length();
  String str="";
  for (int i = len-1; i >=0; i--) {
    str = str+s.charAt(i);
    
  }
  System.out.println(str);

        

    }
//    static String reverse(String s){
//         int l =s.length();
//         char [] ch = s.toCharArray();
//         for (int i = 0; i < ch.length/2; i++) {
//             char temp = ch[i];
//             ch[i] = ch[l-1-i];
//             ch[l-1-i]=temp;
//         }
        
//         String result ="";
//         for (char c : ch) { 
//             result = result+c;
//         } 

//         return result;
//         }

}
