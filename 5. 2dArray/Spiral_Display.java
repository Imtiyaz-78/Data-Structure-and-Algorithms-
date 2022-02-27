/*
Spiral Display
Easy

1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a spiral.
Note - Please check the sample output for details.

Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e1, e2, .. n * m elements <= 10^9

Format
Input
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements

Output
e11
e21
..
en1
en2
en3
..
enm
e(n-1)m
..
e1m
e1(m-1)
..
e12
e22
e32
..

Example
Sample Input

3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35

Sample Output
11
21
31
32
33
34
35
25
15
14
13
12
22
23
24
*/

import java.io.*;
import java.util.*;

public class Spiral_Display {

  public static void main(String[] args) throws Exception {
    // write your code here

    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] arr = new int[n][m];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    int minr = 0;
    int maxr = arr.length - 1;
    int minc = 0;
    int maxc = arr[0].length - 1;
    int count = 1;
    int total = n * m;

    while (count <= total) {
      // left wall , downnwards | Column is fixed at minC, and row is varies from min-row to max-row

      for (int i = minr, j = minc; i <= maxr && count <= total; i++) {
        System.out.println(arr[i][j]);
        count++;
      }
      minc++;

      // bottom wall, rightwards | row is fixed at maxr, and column is varies from minc to maxc

      for (int i = maxr, j = minc; j <= maxc && count <= total; j++) {
        System.out.println(arr[i][j]);
        count++;
      }
      maxr--;

      // right wall, upwards | column is fixed at maxc, and row is varies from maxr to minr

      for (int i = maxr, j = maxc; i >= minr && count <= total; i--) {
        System.out.println(arr[i][j]);
        count++;
      }
      maxc--;

      // top wall, leftwards | row is fixed at minr, and column is varis from maxc to minc
      for (int i = minr, j = maxc; j >= minc && count <= total; j--) {
        System.out.println(arr[i][j]);
        count++;
      }

      minr++;
    }
  }
}
