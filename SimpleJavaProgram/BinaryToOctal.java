public class BinaryToOctal {
    public static void main(String []args) {
        int num=101001;
        int rem,deci=0,i=0;
        int t1=num;
        while(t1!=0){
            rem=t1%10;
            t1=t1/10;
            deci+=rem*Math.pow(2, i);
            ++i;
        }
        int t2=deci;
        int rem2=0;
        String octal=" ";
        while(t2!=0){
            rem2=t2%8;
            t2=t2/8;
         octal=rem2+octal;
        }
        System.out.println(octal);
    }
}
