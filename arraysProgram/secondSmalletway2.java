package arraysProgram;

public class secondSmalletway2 {
    public static void main(String[] args) {
        int[] arr = { 12, 43, 23, 22, 4, 55, 6, 7, 5, 33 };
        int largest = Integer.MAX_VALUE;
        int secongLargest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < largest) {
                secongLargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<secongLargest && arr[i]!=largest){
                secongLargest=arr[i];
            }
        }
  if(secongLargest== Integer.MAX_VALUE){
    System.out.println("not found seconlargest element");
  }
  else{
    System.out.println(secongLargest);
  }
    }
}
