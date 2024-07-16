package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String s1 = "pankaj";
        String s2 = "pankaj";
   boolean flag=true;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        if (ch1.length != ch2.length) {
            System.out.println("not an anagram");
            flag=false;
            System.exit(0);
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < ch2.length; i++) {
            if(ch1[i]!=ch2[i]){
                System.out.println("not a anagram");
                flag=false;
                System.exit(0);
            }
       
        }
        if(flag){
            System.out.println("an anagram");
        }
    }
}
