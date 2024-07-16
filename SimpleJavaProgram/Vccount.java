import java.util.Scanner;

public class Vccount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
   String ch=sc.next();
   ch=ch.toLowerCase();
   int vcount=0;
   int ccount=0;
  for (int i = 0; i < ch.length(); i++) {
     if(ch.charAt(i) == 'a' || ch.charAt(i) == 'e' || ch.charAt(i) == 'i' || ch.charAt(i) == 'o' || ch.charAt(i) == 'u' )
          vcount++;
        else
          ccount++;

    }
    System.out.println(vcount+" "+ccount);
  }
    }

