package Backtracking;

public class ratInDeadMaze {
    public static void main(String[] args) {
        int row = 3;
        int cols = 3;
        int[][] maze = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 } };
        boolean[][] isVisited = new boolean[row][cols];

        // print(0,0,row-1,cols-1,maze,"");
        // printAllFourdirections(0, 0, row-1, cols-1,"", maze,isVisited);
        // printpathOptimizedOne(0, 0, row-1, cols-1, maze,"");
    }

    public static void print(int sr, int sc, int er, int ec, int[][] maze, String s) {
        if (sr < 0 || sc < 0 || sr > er || sc > ec)
            return;
        if (sr == sc && sc == ec) {
            System.out.println(s);
            return;
        }

        if (maze[sr][sc] == 0)
            return;
        // go rigth
        print(sr, sc + 1, er, ec, maze, s + "R");
        // go down
        print(sr + 1, sc, er, ec, maze, s + "D");

    }

    public static void printAllFourdirections(int sr, int sc, int er, int ec, String s, int[][] maze,
            boolean[][] isVisited) {
        if (sr < 0 || sc < 0 || sr > er || sc > ec)
            return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        if (maze[sr][sc] == 0)
            return;
        if (isVisited[sr][sc] == true)
            return;

        isVisited[sr][sc] = true;
        // go rigth
        printAllFourdirections(sr, sc + 1, er, ec, s + "R", maze, isVisited);
        // go down
        printAllFourdirections(sr + 1, sc, er, ec, s + "D", maze, isVisited);
        // go left
        printAllFourdirections(sr, sc - 1, er, ec, s + "L", maze, isVisited);
        // go up
        printAllFourdirections(sr - 1, sc, er, ec, s + "U", maze, isVisited);

        isVisited[sr][sc] = false;

    }

    public static void printpathOptimizedOne(int sr, int sc, int er, int ec, int[][] maze, String s) {
        if (sr < 0 || sc < 0 || sr > er || sc > ec)
            return;
        if (sr == er && sc == ec) {
            System.out.println(s);
            return;
        }
        if (maze[sr][sc] == 0)
            return; // blocked
        if (maze[sr][sc] == -1)
            return; // this is already visited

        maze[sr][sc] = -1; // mark as visited

        // go right
        printpathOptimizedOne(sr, sc + 1, er, ec, maze, s + "R");
        // go down
        printpathOptimizedOne(sr + 1, sc, er, ec, maze, s + "D");
        // go left
        printpathOptimizedOne(sr, sc - 1, er, ec, maze, s + "L");
        // go up
        printpathOptimizedOne(sr - 1, sc, er, ec, maze, s + "U");

        // backtracking
        maze[sr][sc] = 1; // unmark as visited
    }
}
