package arraysProgram;

public class SelectionSortNumber {
    public static void main(String []args) {
        int []a={10,50,80,68,76,56};
        int min,temp=0;

        for (int i = 0; i < a.length; i++) {
            min=i;
            for (int j = i+1; j < a.length; j++) {
                if(a[j]<a[min]){
                    min=j;
                }
                temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
   
    
}
