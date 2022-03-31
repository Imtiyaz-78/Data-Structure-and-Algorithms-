
import java.util.*;

public class Get_Maze_pathWith_jumps {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        ArrayList<String> paths = getMazePaths(0, 0, rows - 1, cols - 1);
        System.out.println(paths);
        scn.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if (sr == dr && sc == dc) {
            // Positive Base case
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } 

        ArrayList<String> res = new ArrayList<>();


        // Horizontal Paths
        int jump = 1;
        while(sc + jump <= dc){
            ArrayList<String> rightpaths = getMazePaths(sr, sc + jump, dr, dc);
            for (String str : rightpaths) {
                res.add("h" + jump + str);
                
            }
            jump++;
        }

        // Vertical Path
        jump = 1;
        while(sr + jump <= dr){
            ArrayList<String> downpaths = getMazePaths(sr + jump, sc , dr, dc);
            for (String str : downpaths) {
                res.add("v" + jump + str);
                
            }
            jump++;
        }


        // Diagonal
        jump = 1;
        while(sr + jump <= dr && sc + jump <= dc ){
            ArrayList<String> diagonal = getMazePaths(sr + jump, sc + jump, dr, dc);
            for (String str : diagonal) {
                res.add("d" + jump + str);
               
            }

            jump++;
        }
       
        return res;
    }

}
/*
Get Maze Path With Jumps
Easy

1. You are given a number n and a number m representing number of rows and columns in a maze.
2. You are standing in the top-left corner and have to reach the bottom-right corner. 
3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints
0 <= n <= 10
0 <= m <= 10

Format
Input
A number n
A number m

Output
Contents of the arraylist containing paths as shown in sample output

Example
Sample Input

2
2

Sample Output
[h1v1, v1h1, d1]
*/



