package arraysProgram;

public class MergeArray {
   public static void main(String[] args) {
      int[] a = { 1, 2, 3, 4, 5, 6 };
      int[] b = { 7, 8, 9, 10 };
      int c = a.length + b.length;
      int[] res = new int[c];
      int j = 0;
      for (int i = 0; i < a.length; i++) {
         res[j] = a[i];
         j++;
      }
      for (int i = 0; i < b.length; i++) {
         res[a.length + i] = b[i];
         j++;
      }
    
      for (int i = 0; i < res.length; i++) {
         System.out.print(res[i] + " ");
      }
   }
}
