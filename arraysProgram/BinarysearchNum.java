package arraysProgram;

public class BinarysearchNum {
    public static void main(String []args) {
        int[] arr={12,23,34,45,56,67,78,89,90};
        int li=0;
        int hi=arr.length-1;
        int mi=(li+hi)/2;
        int item=99;
        while (li<=hi) {
            if (arr[mi]==item) {
              System.out.println(item+" is found ");  
              break;
            }
        else if(arr[mi]<item){
                li=mi+1;
            }
            else{
                hi=mi-1;
            }
            mi=(li+hi)/2;
        }
if(li>hi){
    System.out.println("not found");
}

    }
}
