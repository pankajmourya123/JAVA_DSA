package arraysProgram;

public class Maxrow2d {
    public static void main(String[] args) {
        int[][] a = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
        int sumRow;
        int maxRow = 0;
        int maxSum = Integer.MIN_VALUE;
       

        for (int i = 0; i < a.length; i++) {
            sumRow = 0;
            for (int j = 0; j < a[i].length; j++) {
                sumRow = sumRow + a[i][j];
                
            }
            if (sumRow > maxSum) {
                maxSum = sumRow;
                maxRow = i;
            }
        }
    
        System.out.println( maxSum);
    }
}
