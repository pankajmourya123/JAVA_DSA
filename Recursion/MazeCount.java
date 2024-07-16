package Recursion;

public class MazeCount {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int count = maze(1, 1, rows, cols);
        System.out.println(count);
        print(1, 1, rows, cols, "");
    }

    public static int maze(int sr, int sc, int er, int ec) {
        if (sr > er || sc > ec) return 0;
        if (sr == er && sc == ec) return 1;

        int downWays = maze(sr + 1, sc, er, ec);
        int rightWays = maze(sr, sc + 1, er, ec);

        int totalWays = downWays + rightWays;
        return totalWays;
    }

    public static void print(int sr, int sc, int er, int ec, String path) {
        if (sr > er || sc > ec) return;

        if (sr == er && sc == ec) {
            System.out.println(path);
            return;
        }
        print(sr + 1, sc, er, ec, path + "D");
        print(sr, sc + 1, er, ec, path + "R");
    }
}
