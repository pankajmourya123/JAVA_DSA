
// Problem Statement:
// You are given n disks initially stacked in ascending order of size on one of the three rods labeled "Source" (S). The other two rods are labeled "Helper" (H) and "Destination" (D). You need to move all the disks from the "Source" rod to the "Destination" rod using the following rules:

// You can only move one disk at a time.
// A larger disk cannot be placed on top of a smaller disk.
// Write a Java program to implement a recursive function towerOfHanoi(n, src, helper,dest) that prints the sequence of moves to move 
// n disks from the "Source" rod to the "Destination" rod using the "Helper" rod.

// Approach:

// Base Case: If there is only one disk to move (n=1), move it from the "Source" rod to the "Destination" rod directly and return.
// Recursive Case:
// Move n−1 disks from the "Source" rod to the "Helper" rod using the "Destination" rod as the auxiliary rod.
// Move the largest disk from the "Source" rod to the "Destination" rod.
// Move n−1 disks from the "Helper" rod to the "Destination" rod using the "Source" rod as the auxiliary rod.
// Repeat this process recursively until all disks are moved to the "Destination" rod.








package Recursion;

public class Towerofhonai {
    public static void main(String[] args) {
        int n=3;
        towerofhonai( n,"S","H","D");
    }
    public static void towerofhonai(int i,String src,String helper,String destion){
        if(i==1){
            // System.out.println("transfer disk " +i+ " from "+src +" to "+destion);
            return;
        }
        towerofhonai(i-1, src, destion, helper);
        // System.out.println("transfer disk " +i+ " from "+src +" to "+destion);
        
        towerofhonai(i-1, helper, src, destion);

    }
}
