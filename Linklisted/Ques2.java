package Linklisted;
import java.util.*;
public class Ques2 {
    private int size;
    private Node head;

    Ques2() {
        size = 0;
    }

    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        size++;
    }

    public void deleteNodesGreaterThan(int threshold) {
        Node currNode = head;
        Node prevNode = null;

        while (currNode != null) {
            if (currNode.data > threshold) {
                if (prevNode == null) {
                    
                    head = currNode.next;
                } else {
                    
                    prevNode.next = currNode.next;
                }
                size--;
            } else {
                prevNode = currNode;
            }
            currNode = currNode.next;
        }
    }

    public void print() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Ques2 list = new Ques2();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();

        System.out.println("Enter elements (in the range of 1-50):");
        for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            if (element >= 1 && element <= 50) {
                list.addLast(element);
            } else {
                System.out.println("Invalid input. Please enter a number in the range of 1-50.");
                i--;  // Decrement the loop variable to re-enter the invalid input
            }
        }

        System.out.println("Original list:");
        list.print();

        // Delete nodes with values greater than 25
        list.deleteNodesGreaterThan(25);

        System.out.println("List after deleting nodes with values greater than 25:");
        list.print();
    }
}

