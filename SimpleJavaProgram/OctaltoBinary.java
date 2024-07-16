class OctaltoBinary{
    public static void main(String []args) {
        int octal=67;
        int t=octal;
        int rem,deci=0,i=0;
        while(t!=0){
            rem=t%10;
            t=t/10;
            deci+=rem*Math.pow(8, i);
            ++i;

        }
        int rem2;
        String binary="";
        int t2=deci;
        while(t2!=0){
          rem=t2%2;
            t2=t2/2;
            binary=rem+binary;
        }
        System.out.println(binary);
    }
}