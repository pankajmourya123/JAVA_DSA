package arraysProgram;
import java.util.Set;
import java.util.HashSet;
public class duplicateway2 {
   public static void main(String[] args) {
    int[] a={11,23,12,43,11,78};
   Set<Integer> s=new HashSet<>();
   for (int no  : a) {
    boolean b=s.add(no);
    if(b==false){
        System.out.println(no);
    }
   }
   }
}
