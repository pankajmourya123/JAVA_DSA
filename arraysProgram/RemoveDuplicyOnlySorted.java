package arraysProgram;

public class RemoveDuplicyOnlySorted {
    public static void main(String[] args) {
        //only for sorted array

        int [] a={1,2,2,3,3,3,4,4,5,5};
        // int[] temp=new int [a.length];
        // int j=0;
        // for (int i = 0; i < a.length-1; i++) {
        //  if(a[i]!=a[j+1])   {
        //     temp[j]=a[i];
        //     j++;
        //  }
        // }
        // temp[j]=a[a.length-1];
        // for (int i = 0; i < temp.length; i++) {
        //     System.out.print(a[i]+" ");
        // }

        //not using empty array or array

       
        int j=0;
        for (int i = 0; i < a.length-1; i++) {
         if(a[i]!=a[i+1])   {
            a[j]=a[i];
            j++;
         }
        }
        a[j]=a[a.length-1];
        for (int i = 0; i < j+1; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
