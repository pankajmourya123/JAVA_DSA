package Recursion;

public class Binaryseacrh {
 public static void main(String[] args) {
    int[] a={3,5,7,8,45};
    int target=45;
    int res=bisearch(a,target,0,a.length-1);
    System.out.println(res);
 }  
 public static int bisearch(int[] a,int t,int s,int e ) {
    if(s>e){
        return -1;
    }
    int mid=s+(e-s)/2;
    if(a[mid]==t){
  return mid;
    }
    if(t>a[mid]){
       return bisearch( a, t,mid+1, e );
    }
   return bisearch( a, t,s, e-1 );
 }
}
