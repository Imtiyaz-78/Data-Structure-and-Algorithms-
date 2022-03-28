
// import java.io.*;
import java.util.*;

public class Get_Maze_Path {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        ArrayList<String> paths = getMazePaths(1, 1, rows, cols);
        System.out.println(paths);
        scn.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr > dr || sc > dc) {
            ArrayList<String> bres = new ArrayList<>();
            return bres;
        } else if (sr == dr && sc == dc) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> mypaths = new ArrayList<>();
        ArrayList<String> myhpaths = getMazePaths(sr, sc + 1, dr, dc);
        ArrayList<String> myvpaths = getMazePaths(sr + 1, sc, dr, dc);

        for (String myhpath : myhpaths) {
            mypaths.add("h" + myhpath);
        }

        for (String myvpath : myvpaths) {
            mypaths.add("v" + myvpath);
        }

        return mypaths;
    }

}

/*
 * Get Maze Paths
 * Easy
 * 
 * 1. You are given a number n and a number m representing number of rows and
 * columns in a maze.
 * 2. You are standing in the top-left corner and have to reach the bottom-right
 * corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step
 * vertical).
 * 3. Complete the body of getMazePath function - without changing signature -
 * to get the list of all paths that can be used to move from top-left to
 * bottom-right.
 * Use sample input and output to take idea about output.
 * 
 * Note -> The online judge can't force you to write the function recursively
 * but that is what the spirit of question is. Write recursive and not iterative
 * logic. The purpose of the question is to aid learning recursion and not test
 * you.
 * 
 * Constraints
 * 0 <= n <= 10
 * 0 <= m <= 10
 * 
 * Format
 * Input
 * A number n
 * A number m
 * 
 * Output
 * Contents of the arraylist containing paths as shown in sample output
 * 
 * Example
 * Sample Input
 * 
 * 3
 * 3
 * 
 * Sample Output
 * [hhvv, hvhv, hvvh, vhhv, vhvh, vvhh]
 * 
 * 
 */
