package arraysProgram;

public class dulipcateway1 {
    public static void main(String []args) {
        int [] a={21,12,32,34,22,11,12,11};
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length-1; j++) {
                if((a[i]==a[j])&& i!=j){
                      System.out.print(a[j]);
                }
            }
        }
    }
}
