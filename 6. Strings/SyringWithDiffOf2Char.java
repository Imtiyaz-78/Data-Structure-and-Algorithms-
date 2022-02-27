


import java.io.*;
import java.util.*;

// SyringWithDiffOf2Char

public class SyringWithDiffOf2Char {


  // This Is Function for These Problem Difference
  public static String solution(String str) {
    // write your code here
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      if (i == str.length() - 1) {
        char chi = str.charAt(i);
        sb.append(chi);
      } 
      
      else {
        char chp = str.charAt(i); // Previous Character
        char chn = str.charAt(i + 1); // Next Character
        sb.append(chp);
        sb.append(chn - chp);
      }


    }

    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();

    String Result = solution(str);  // Calling Of Function
    System.out.println(Result);

  }
}


/*
String With Difference Of Every Two Consecutive Characters
Easy

1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
   For "abecd", the answer should be "a1b3e-2c1d", as 
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
   'd'-'c' = 1

Constraints
1 <= length of string <= 1000

Format
Input
A String

Output
A String

Example
Sample Input

pepCODinG

Sample Output
p-11e11p-45C12O-11D37i5n-39G
*/
