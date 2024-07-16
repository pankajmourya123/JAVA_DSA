package arraysProgram;

public class FristDuplicateNumway1 {
    public static void main(String []args) {
        int [] a={21,12,34,43,32,32,27};
        int temp=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++) {
                if((a[i]==a[j])&&(i!=j)){
                       temp=temp+1;
                       System.out.print(a[j]+" ");
                       break;
                }
            }
            if(temp>0){
                break;
            }

        }
    }
}
