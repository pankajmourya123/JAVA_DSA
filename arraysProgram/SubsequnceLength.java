package arraysProgram;

import java.util.HashSet;

public class SubsequnceLength {
    public static void main(String[] args) {
      int [] arr={1,2,3,4,5,8,99,77,66};
      HashSet<Integer> hs=new HashSet<>();
      for (int i = 0; i < arr.length; i++) {
        hs.add(arr[i]);
      }
      int long_leng=0;
      for (int i = 0; i < arr.length; i++) {
        if (!hs.contains(arr[i]-1)) {
            int no =arr[i];
            while (hs.contains(no)) {
                no++;
            }
            if(long_leng<(no-arr[i])){
                long_leng=no-arr[i];
            }
        }
      }
      System.out.println(long_leng);
    }
}
