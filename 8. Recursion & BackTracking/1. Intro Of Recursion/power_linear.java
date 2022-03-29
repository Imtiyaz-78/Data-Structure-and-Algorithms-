import java.io.*;
import java.util.*;

public class power_linear {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int x = scn.nextInt();
    int n = scn.nextInt();
    int result = power(x, n);
    System.out.println(result);
  }

  public static int power(int x, int n) {
    if (n == 0) {
      return 1;
    }

    // Expectation => p(2, 5) = 2 * 2 * 2 * 2 * 2
    // faith       => p(2, 4) = 2 * 2 * 2 * 2
    // EWF         => p(2, 5) = p(2, 4) * 2

    int xpnm1 = power(x, n - 1); // xpnm1 = x ka power n minus 1
    int xpn = xpnm1 * x; // xpn = x ka power n minus 1 that means

    return xpn; // xpn = x ka power n
  }
}

/*
Power-linear
Easy

1. You are given a number x.
2. You are given another number n.
3. You are required to calculate x raised to the power n. Don't change the signature of power function .

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.

Constraints
1 <= x <= 10
0 <= n <= 9

Format
Input
A number x
A number n

Output
x raised to the power n

Example
Sample Input

2
5

Sample Output
32
*/
