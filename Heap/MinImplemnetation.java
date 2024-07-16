package Heap;

class MinHeap {
    int[] arr;
    int size;
    int capacity;

    MinHeap(int c) {
        arr = new int[c];
        size = 0;
        capacity = c;
    }

    public int left(int i) {
        return 2 * i + 1;
    }

    public int right(int i) {
        return 2 * i + 2;
    }

    public int parent(int i) {
        return (i - 1) / 2;
    }

    public void insert(int x) {
        if (size == capacity) return;
        size++;
        int i = size - 1;
        arr[i] = x;
        while (i != 0 && arr[parent(i)] > arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    public void MinHeapify(int[] arr, int size, int i) {
        int l = left(i);
        int r = right(i);
        int smallest = i;
        if (l < size && arr[l] < arr[smallest])
            smallest = l;
        if (r < size && arr[r] < arr[smallest])
            smallest = r;
        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            MinHeapify(arr, size, smallest);
        }
    }

    public int getMin() {
        return arr[0];
    }

    public int extractMin() {
        if (size == 0) return Integer.MAX_VALUE;
        if (size == 1) {
            size--;
            return arr[0];
        }
        int temp = arr[0];
        arr[0] = arr[size - 1];
        arr[size - 1] = temp;
        size--;
        MinHeapify(arr, size, 0);
        return arr[size];
    }

    public void decreaseKey(int i, int x) {
        arr[i] = x;
        while (i != 0 && arr[parent(i)] > arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    public void delete(int i) {
        decreaseKey(i, Integer.MIN_VALUE);
        extractMin();
    }

    public void buildHeap(int[] arr, int size) {
        for (int i = size / 2 - 1; i >= 0; i--) {
            MinHeapify(arr, size, i);
        }
    }

    public void heapSort(int[] inputArr, int n) {
        buildHeap(inputArr, n);
        for (int i = n - 1; i > 0; i--) {
            int temp = inputArr[0];
            inputArr[0] = inputArr[i];
            inputArr[i] = temp;
            MinHeapify(inputArr, i, 0);
        }
    }
}

public class MinImplemnetation {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10); 

        minHeap.insert(3);
        minHeap.insert(2);
        minHeap.insert(1);
        minHeap.insert(15);
        minHeap.insert(5);
        minHeap.insert(4);
        minHeap.insert(45);

        System.out.println("Extracted minimum element: " + minHeap.extractMin());
        System.out.println("Minimum element: " + minHeap.getMin());

        minHeap.decreaseKey(3, 1);
        minHeap.delete(0);

        int[] arr = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        minHeap.heapSort(arr, n);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
