import java.util.Scanner;

class Ascii {
  public static void main(String[] args) {
    Scanner sc = new Scanner ((System.in));
    System.out.println("Enter a Character");
    char alpha= sc.next().charAt(0);
    int no=alpha;
    int castAscii = (int) alpha;
    System.out.println("Ascii of of "+alpha+" is "+ no);
    System.out.println(castAscii);

    // char c1 = 'A';
    // char c2 = 'B';
    // System.out.println(c1 + c2);

    
  }
}
