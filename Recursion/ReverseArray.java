package Recursion;

import java.util.Collection;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr={2,3,3,4,5,6,7};
        int n=arr.length;
        reverseArray(0,arr,n);
    }
    public static void reverseArray(int i,int []arr,int n){
        if(i==n){
            return;
        }
       
         reverseArray(i+1, arr, n);
         System.out.print(arr[i]+" ");
    }
}
