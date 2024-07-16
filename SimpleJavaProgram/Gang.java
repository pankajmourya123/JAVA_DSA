import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Gang {
   public static void main(String[] args) {
    int  N = 4;
    int  a[] = {2, 0, 3, 3, 1};
    Arrays.sort(a);
    int ch=1;
           ArrayList<Integer> ls = new ArrayList<Integer>();
       HashSet hs=new HashSet<>();
       for (int  i : a) {
         boolean flag=hs.add(i);
         if(flag==false){
   ls.add(i);
         }else{
          ch=0;
         }
       }  

        if(ch==0){
         ls.add(-1);
       }
       for (Object object : ls) {
         System.out.println(object);
       }
      
    }  
   }

