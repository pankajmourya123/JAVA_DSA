import javax.sound.sampled.SourceDataLine;

public class Prd_sum {
    public static void main(String[] args) {
int n=234;
int rem=0;
int prd=1;
int sum=0;
while(n!=0){
    rem=n%10;
    prd=prd*rem;
    sum=sum+rem;
    n=n/10;
}
int result=prd-sum;
System.out.println(result);
    }

       

}
