
import java.io.*;
import java.util.*;

public class PrintAllpalindromicSubstrings {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.nextLine(); 

    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j <= str.length(); j++) {
        String sub = str.substring(i, j);

        boolean isPalindrome = IsPalindrome(sub);
        if (isPalindrome == true) {
          System.out.println(sub);
        }
      }
    }
    scn.close();
  }

  public static boolean IsPalindrome(String sub) {
    boolean flag = true;

    int left = 0;
    int right = sub.length() - 1;
    while (left < right) {
      char chleft = sub.charAt(left);
      char chright = sub.charAt(right);
      if (chleft != chright) {
        flag = false;
        break;
      }

      left++;
      right--;
    }

    return flag;
   
  }
}




/*
Print All Palindromic Substrings
Easy

1. You are given a string. 
2. You have to print all palindromic substrings of the given string.

Constraints
1 <= length of string <= 500

Format
Input
A String

Output
All palindromic substrings(one in a line).
First, all palindromic substrings starting from first character of string will be printed, then from second character and so on.

Example
Sample Input

abcc

Sample Output
a
b
c
cc
c

*/
