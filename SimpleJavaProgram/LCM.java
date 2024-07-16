 class LCM {
public static void main(String []args) {
    int n1 = 72, n2 = 120, lcm;

    int ans=lcm(n1, n2);
    System.out.println(ans);
    // lcm = (n1 > n2) ? n1 : n2;

    
    // while(true) {
    //   if( lcm % n1 == 0 && lcm % n2 == 0 ) {
    //     System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
    //     break;
    //   }
    //   ++lcm;
    // }

        
}    

public static int gcd(int A,int B){
  while (B != 0) {
    int temp = B;
    B = A % B; 
    A = temp;  
}
return A;
}

public static int lcm(int a,int b){
  return (a*b)/gcd(a, b);
}
}
