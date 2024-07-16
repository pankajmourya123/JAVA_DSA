package arraysProgram;
import java.util.HashSet;
public class FristDuplicateNumway2 {
    public static void main(String []args) {
        int temp=-1;
        int [] a={21,23,21,23,43,22,33};
        HashSet<Integer> hs =new HashSet<>();
    
        for (int i = a.length-1; i >=0; i--) {
            if(hs.contains(a[i])){
                temp=i;
            }
            else{
                hs.add(a[i]);
            }
        }
        if (temp!=1) {
            System.out.println(a[temp]);
        } else {
            
        }

    }
}
