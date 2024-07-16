import java.util.ArrayList;
import java.util.List;

public class Selfdiving {
 public static void main(String[] args) {
    int left = 1,right = 22;
    int max=left>right?left:right;
    List<Integer>ls=new ArrayList<Integer>() ;

for (int i = 1;  i<=max; i++) {
    if(i%i==0 ){
ls.add(i);
    }
}
for (Integer integer : ls) {
    System.out.println(integer);
}
 }   
}
