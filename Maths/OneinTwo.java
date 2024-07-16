package Maths;

public class OneinTwo {
public static void main(String[] args) {
    int[] arr={2,2,3,4,4,5,5}; 
    System.out.println(num(arr));
}
static int num(int[] arr){
    int ans=0;
    for (int i : arr) {
       ans^=i;
    }
    return ans;
}
}
