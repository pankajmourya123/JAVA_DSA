package arraysProgram;

import java.util.ArrayList;

public class ThreeArrayCommon {
    public static void main(String[] args) {
        int[] a1 = { 2, 4, 5, 6, 7 };
        int[] a2 = { 2, 4, 6, 8, 10 };
        int[] a3 = { 2, 4, 6, 8, 7 };
        ArrayList<Integer> al = new ArrayList<>();
        int x = 0;
        int y = 0;
        int z = 0;
        while (x < a1.length && y < a2.length && z < a3.length) {
            if (a1[x] == a2[y] && a2[y] == a3[z]) {
                al.add(a1[x]);
                x++;
                y++;
                z++;

            } else if (a1[x] < a2[y]) {
                x++;
            } else if (a2[y] < a3[z]) {
                y++;
            } else {
                z++;
            }
        }
        for (int no : al) {
            System.out.print(no+" ");
        }
    }
}
