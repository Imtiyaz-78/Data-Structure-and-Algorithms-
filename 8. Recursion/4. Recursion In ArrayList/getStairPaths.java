
// import java.io.*;
import java.util.*;

public class getStairPaths{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
        scn.close();
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres; // [""] -> 1, 

        }
        
         else if(n < 0){
            ArrayList<String> bres = new ArrayList<>();
            return bres; // [] -> 0
        }
    
        ArrayList<String> pathsfromnm1 = getStairPaths(n - 1);
        ArrayList<String> pathsfromnm2 = getStairPaths(n - 2);
        ArrayList<String> pathsfromnm3 = getStairPaths(n - 3);
        
        ArrayList<String> pathsfromn = new ArrayList<>();
        for(String pathfromnm1: pathsfromnm1){
            String pathfromn = "1" + pathfromnm1;
            pathsfromn.add(pathfromn);
        }
        
        for(String pathfromnm2: pathsfromnm2){
            String pathfromn = "2" + pathfromnm2;
            pathsfromn.add(pathfromn);
        }
        
        for(String pathfromnm3: pathsfromnm3){
            String pathfromn = "3" + pathfromnm3;
            pathsfromn.add(pathfromn);
        }
        
        return pathsfromn;
    }

}

/*Get Stair Paths
Easy

1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints
0 <= n <= 10

Format
Input
A number n

Output
Contents of the arraylist containing paths as shown in sample output

Example
Sample Input

3

Sample Output
[111, 12, 21, 3]
*/
