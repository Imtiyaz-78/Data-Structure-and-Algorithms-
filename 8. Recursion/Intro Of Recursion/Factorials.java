

import java.io.*;
import java.util.*;

public class Factorials {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int fact = Factorial(n); // Calling Of Function
    System.out.println(fact);
  }

  // This Function is for Factorial
  public static int Factorial(  int n) {
    if (n == 0) {
      return 1;
    }

    //Expectation => f(5)= 5 * 4 * 4 * 3 * 2 * 1
    // Faith      => f(4)= 4 * 3 * 2 * 1
    // Ewf        =>  5 * f(4)

    int fnm1 = Factorial(n - 1);
    int fn = n * (fnm1);

    return fn;
  }
}


/*
Factorial
Easy

1. You are given a number n.
2. You are required to calculate the factorial of the number. Don't change the signature of factorial function.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints
0 <= n <= 10

Format
Input
A number n

Output
factorial of n

Example
Sample Input

5

Sample Output
120
*/














