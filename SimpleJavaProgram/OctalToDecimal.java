 class OctalToDecimal {
    public static void main(String []args) {
        int num=116;
        int t=num;
        int rem,i=0;
        int d=0;
        while(t!=0){
            rem=t%10;
           
            d+= rem * Math.pow(8, i);
            ++i;
            t=t/10;
        }
        System.out.println(d);
    }
}
