package arraysProgram;

public class ThreeDim {
    public static void main(String []args) {
        int [][][] a={{{10,20,30,30,40},{70,90,80},{60,8,79,89}}};
        
        
        for (int i = 0; i < a.length; i++) {
           for (int j = 0; j < a[i].length; j++) {
         
            for (int j2 = 0; j2 < a[i][j].length; j2++) {
              
                System.out.print(a[i][j][j2]+" ");
            }
           System.out.println();
           }
           System.out.println();
        }
        System.out.println();
    }
}
