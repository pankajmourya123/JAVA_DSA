package arraysProgram;

public class TwoDIM {
    public static void main(String []args) {
        int [][] a={{10,20,30,30,40},{70,90,80}};
        for (int i = 0; i < a.length; i++) {
           for (int j = 0; j < a[i].length; j++) {
            System.out.print(a[i][j]+" ");
           }
           System.out.println();
        }
        System.out.println();
    }

}
