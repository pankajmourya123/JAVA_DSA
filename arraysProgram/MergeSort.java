package arraysProgram;

public class MergeSort {
    int array[];
    int[] temparr;
    int length;

    public static void main(String[] args) {
        int[] inputarr = { 32, 43, 12, 23, 45, 43, 11 };
        MergeSort ms = new MergeSort();
        ms.sort(inputarr);
        for (int i : inputarr) {
            System.out.print(i + " ");
        }
    }

    public void sort(int inputarr[]) {
        this.array = inputarr;
        this.length = inputarr.length;

        this.temparr = new int[length];

        divideArr(0, length - 1

        );

    }

    public void divideArr(int lower, int higher) {

        if (lower < higher) {
            int middle = lower + (higher - lower) / 2;
            divideArr(lower, middle);
            divideArr(middle + 1, higher);
            MergeArr(lower, middle, higher);
        }
    }

    public void MergeArr(int lower, int middle, int higher) {
        for (int i = lower; i <= higher; i++) {
            temparr[i] = array[i];

        }
        int i = lower;
        int j = middle + 1;
        int k = lower;
        while (i <= middle && j <= higher) {
            if (temparr[i] <= temparr[j]) {
                array[k] = temparr[i];
                i++;
            } else {
                array[k] = temparr[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = temparr[i];
            k++;
            i++;
        }
    }
}
