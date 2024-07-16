public class Solve {
    public static void main(String[] args) {
       int   nums []= {0,1,2,3,4};
       int  index[] = {0,1,2,2,1};
      //  Output: [4,0,1,1,3]
      int [] target =new int[index.length];
      for (int i = 0; i < index.length; i++) {
          for (int j = i; j > index[i]; j--) {
              target[j]=target[j-1];
          }
          target[index[i]]=nums[i];
      }
       
          
   
    
      for (int i : target) {
        System.out.println(i);
      }
    }

  }