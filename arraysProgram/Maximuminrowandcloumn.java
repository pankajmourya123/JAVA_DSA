package arraysProgram;

public class Maximuminrowandcloumn {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 2, -1 }, { 4, -1, 6 }, { 7, 8, 9 } };
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[] maxColumnValues = new int[cols];
    int[] maxRowValues = new int[rows];

    //find maximum from cloumn;
    for (int j = 0; j < cols; j++) {
      int max = Integer.MIN_VALUE;
      for (int i = 0; i < rows; i++) {
        max = Math.max(max, matrix[i][j]);
      }
      maxColumnValues[j] = max;
    }
   for (int i = 0; i < maxColumnValues.length; i++) {
    System.out.print(maxColumnValues[i]+" ");
   }

   //find maximum from Row;
   for (int i = 0; i <rows; i++) {
    int max = Integer.MIN_VALUE;
    for (int j = 0; j < cols; j++) {
      max = Math.max(max, matrix[i][j]);
    }
    maxRowValues[i] = max;
   }

   for (int i = 0; i < maxRowValues.length; i++) {
    System.out.print(maxRowValues[i]+" ");
   }
    }
}
