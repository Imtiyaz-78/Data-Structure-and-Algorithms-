import java.io.*;
import java.util.*;

public class String_Compression {

  public static String compression1(String str) { // Repeate Substring Print nahi karna hai
    // write your code here

    String ans = "";

    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == str.charAt(i + 1)) {
        // Nothing Kuchh nahi karna hai  agr char equal ho toh
      }
       else {
        ans = ans + str.charAt(i); // agar pichhla char.. aage wale Character se equal nahi ho toh print karna hai
      }

    }

    ans = ans + str.charAt(str.length() - 1);
    return ans;
  }

  public static String compression2(String str) {
    String ans = "";
    int count = 1;

    for (int i = 0; i < str.length() - 1; i++) {
      if (str.charAt(i) == str.charAt(i + 1)) {
        count++;
      } else {
        ans = ans + str.charAt(i);
        if (count > 1) {
          ans = ans + count;
          count = 1;
        }
      }
    }

    ans = ans + str.charAt(str.length() - 1);
    if (count > 1) {
      ans = ans + count;
      count = 1;
    }

    return ans;
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    String str = scn.next();
    System.out.println(compression1(str));
    System.out.println(compression2(str));
  }
}
/*

String Compression
Easy

1. You are given a string. 
2. You have to compress the given string in the following two ways - 
   First compression -> The string should be compressed such that consecutive duplicates of characters are replaced with a single character.
   For "aaabbccdee", the compressed string will be "abcde".
   Second compression -> The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
   For "aaabbccdee", the compressed string will be "a3b2c2de2".

Constraints
1 <= length of string <= 1000

Format
Input
A String

Output
Two strings representing first compressed string and second compressed string respectively.

Example
Sample Input

wwwwaaadexxxxxx

Sample Output
wadex
w4a3dex6
*/
