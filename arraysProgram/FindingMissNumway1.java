package arraysProgram;

public class FindingMissNumway1 {
    public static void main(String[] args) {
        int []a={1,2,3,4,6};
              int exp_no_element=a.length+1;
              int total_sum=exp_no_element*(exp_no_element+1)/2;
             
              int sum=0;
              for (int i = 0; i < a.length; i++) {
                sum=sum+a[i];
              }
              System.out.println(sum);
              System.out.println(total_sum);
             int  missterming=total_sum-sum;
             System.out.println(missterming);
    }
}
