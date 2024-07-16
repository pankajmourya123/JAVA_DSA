package Heap;

import java.lang.reflect.Array;
import java.util.Arrays;

class MaxHeap {
    int[] arr;
    int capacity;
    int size;

    MaxHeap(int c) {
        arr = new int[c];
        size = 0;
        capacity = c;
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }

    public int left(int i) {
        return 2 * i + 1;
    }

    public int right(int i) {
        return 2 * i + 2;
    }

    public void insert(int x) {
        if (size == capacity) return;
        size++;
        int i = size - 1;
        arr[i] = x;
        while (i != 0 && arr[parent(i)] < arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    public void MaxHeapify(int[] arr, int size, int i) {
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l < size && arr[l] > arr[largest])
            largest = l;
        if (r < size && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            MaxHeapify(arr, size, largest);
        }
    }

    public int getMax() {
        return arr[0];
    }

    public int extractMax() {
        if (size == 0) return Integer.MIN_VALUE;
        if (size == 1) {
            size--;
            return arr[0];
        }

        int temp = arr[0];
        arr[0] = arr[size - 1];
        arr[size - 1] = temp;
        size--;
        MaxHeapify(arr, size, 0);
        return arr[size];
    }

    public void increaseKey(int i, int x) {
        arr[i] = x;
        while (i != 0 && arr[parent(i)] < arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    public void delete(int i) {
        increaseKey(i, Integer.MAX_VALUE);
        extractMax();
    }

    public void buildHeap(int[] arr, int size) {
        for (int i = size / 2 - 1; i >= 0; i--) {
            MaxHeapify(arr, size, i);
        }
    }

    public void heapSort(int[] arr, int n) {
        buildHeap(arr, n);
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            MaxHeapify(arr, i, 0);
        }
    }
    public void show(){
        System.out.println(Arrays.toString(arr));
    }
}

public class MaxImplementation {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(10);

        maxHeap.insert(1);
        maxHeap.insert(2);
        maxHeap.insert(3);
        maxHeap.insert(4);
        maxHeap.insert(6);
        maxHeap.insert(7);
        maxHeap.insert(8);

        maxHeap.show();

        System.out.println("Extracted maximum element: " + maxHeap.extractMax());
        System.out.println("Maximum element: " + maxHeap.getMax());

        maxHeap.increaseKey(3, 20);

        maxHeap.delete(0);

        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        maxHeap.heapSort(arr, n);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
