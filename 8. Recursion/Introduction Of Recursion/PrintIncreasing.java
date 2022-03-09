

import java.io.*;
import java.util.*;

public class PrintIncreasing {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printIncreasing(n);
    }

    // Expectation => pi(n) = 1 2 3 ... n-2 n-1 n
    // Faith => pi(n-1) = 1 2 3 .... n-3 n-2 n-1
    // EwF => pi(n) = pi(n-1) n
    public static void printIncreasing(int n){
        if(n == 0){  // This is Base cases where the loop is Terminates
            return;
        }
        
        printIncreasing(n - 1);
        System.out.println(n);
    }

}

/*
Print Increasing
Easy

1. You are given a positive number n. 
2. You are required to print the counting from 1 to n.
3. You are required to not use any loops. Complete the body of print Increasing function to achieve it. Don't change the signature of the function.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints
1 <= n <= 1000

Format
Input
A number n

Output
1
2
3
..
n

Example
Sample Input

5

Sample Output
1
2
3
4
5
*/