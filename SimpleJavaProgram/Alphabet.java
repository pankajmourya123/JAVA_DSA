 import java.util.Scanner;
 
 class Alphabet {
    public static void main(String []args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Enter a aphalbet");
        char ch=sc.next().charAt(0);
        if((ch >='a' && ch<='z')|| (ch >='A' && ch<='Z')){
            System.out.println("Alphabet");
        }
        else{
            System.out.println("Not aphlabet");
        }
        // char lowercaseA = (char) (ch + 32);
        // System.out.println("Lowercase of " + ch + " is " + lowercaseA);
    }
}
