// Problem Statement:
// You are given 
// n friends, and you want to pair them up for a party. Each person can either go solo or pair up with another friend. You need to find the number of ways to pair up the friends such that no person is left unpaired.

package Recursion;

public class Friends {
    public static int pairFriends(int n) {
        if(n <= 1) {
            return 1;
        }
  
  
         return pairFriends(n-1) + (n-1) * pairFriends(n-2);
     }
  
  
     public static void main(String args[]) {
         int n = 3;
         System.out.println(pairFriends(n));
     }
  
}
