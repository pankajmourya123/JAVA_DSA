 class DecimalToOct {
    public static void main(String []args) {
        int octal=78;
        int decimal=0,rem,i=0;
        String r="";
int t=octal;
while(t!=0){
rem=t%8;
t=t/8;
r=rem+r;
}
      System.out.println(r);  
    }
}
