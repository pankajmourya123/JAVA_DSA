 class DecimalToBinary {
public static void main(String []args) {
    int decimal=11,rem;
    String r="";
    int t=decimal;
    while(t>0){
        rem= t% 2;
        t/= 2;
    r=rem+r;    
}  
System.out.println(r); 
}
 }