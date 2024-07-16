package arraysProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DulipcateTwoArrayHashND {
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5,6,7,8,6,2,2};
        int [] arr2={6,4,3,2,2,1,6,11};
      List<Integer> ls=new ArrayList<>();
        
       
        HashSet <Integer> hs =new HashSet<>();
       
       
        for (int  no : arr1) {
            hs.add(no);
        }
      int i=0;
        for (int  no  : arr2) {
            boolean b=hs.add(no);
           
            if(b==false){
                // System.out.print(no+" ");
                ls.add(no);
         
               
            }
        }
        int k=0;
        int res[]=new int[ls.size()];
        for(int nums:ls)
        {
            res[k++]=nums;
        }
      System.out.println(Arrays.toString(res));
       
        
        
    }
}
