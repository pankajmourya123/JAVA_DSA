package Recursion;

public class Issorted {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,8,5};

        System.out.println(sortedhaikya(arr,0));
    }
public static boolean sortedhaikya(int [] arr,int i){
    if(i==arr.length-1){
        return true;
    }
    if(arr[i]<arr[i+1]){
       return sortedhaikya(arr, i+1);
    }else{
return false;
    }
}
}
