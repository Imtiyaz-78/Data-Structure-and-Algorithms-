

import java.util.*;
import java.io.*;

public class Print_SubSequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.next();
        printSS(0, input, "");
        scn.close();

      
    }

    public static void printSS(int idx, String input, String output) {
        
       if(idx == input.length()){
           System.out.println(output);
           return;
       }

       char ch = input.charAt(idx);

       // yes call
       printSS( idx + 1, input, output + ch);

       // No call 
       printSS( idx + 1, input, output);
    }

    
}

/*
Print Subsequence
Easy

1. You are given a string str.
2. Complete the body of printSS function - without changing signature - to calculate and print all subsequences of str.
Use sample input and output to take idea about subsequences.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints
0 <= str.length <= 7

Format
Input
A string str

Output
Subsequences of str in order hinted by Sample output

Example
Sample Input

yvTA

Sample Output
yvTA
yvT
yvA
yv
yTA
yT
yA
y
vTA
vT
vA
v
TA
T
A
*/
