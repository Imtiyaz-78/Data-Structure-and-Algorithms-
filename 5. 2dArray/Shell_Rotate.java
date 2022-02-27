

import java.util.*;

public class Shell_Rotate {

  public static void main(String[] args) throws Exception {
    // write your code here

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int m = scn.nextInt();
    int[][] twod = new int[n][m];

    for (int i = 0; i < twod.length; i++) {
      for (int j = 0; j < twod[0].length; j++) {
        twod[i][j] = scn.nextInt();
      }
    }

    int s = scn.nextInt(); // Shell Number
    int r = scn.nextInt(); // Rotate By Number i.e kitna se rotate karna hai

    int[] oned = getOnedFromShell(twod, s);
    rotate(oned, r);
    fillTwodShellFromOned(oned, twod, s);
    display(twod);
  }
  
  // Layering for solving This Problem:-
  // 1. make onedArray 
  // 2. 

  public static int[] getOnedFromShell(int[][] twod, int s) {
    int rows = twod.length;
    int cols = twod[0].length;

    int mir = s - 1;
    int mic = s - 1;
    int mar = rows - s;
    int mac = cols - s;

    // Rotate Shell 2:- 5 - 0 + 1 = 4*2 = 8, 7-0+1 = 6*2 = 12 (final 8 + 12 = 20 - 4(corner minus kro))
    int vwcount = mar - mir + 1; // Vrtical Wall Count
    int hwcount = mac - mic + 1; // Horizontal Wall i.e bottom
    int sz = 2 * vwcount + 2 * hwcount - 4; // For Corner because sabhi corner 4 bar extra print ho rahe so re

    int[] oned = new int[sz];
    int idx = 0;

    // left wall | row increases from mir to mar, col stays at mic
    for (int i = mir, j = mic; i <= mar; i++) {
      oned[idx] = twod[i][j];
      idx++;
    }
    mic++;

    // bottom wall | row stays at mar, col increases from mic to mac
    for (int i = mar, j = mic; j <= mac; j++) {
      oned[idx] = twod[i][j];
      idx++;
    }
    mar--;

    // right wall | row decreases from mar to mir, col stays at mac;
    for (int i = mar, j = mac; i >= mir; i--) {
      oned[idx] = twod[i][j];
      idx++;
    }
    mac--;

    // top wall | row stays at mir, col decreases from mac to mic
    for (int i = mir, j = mac; j >= mic; j--) {
      oned[idx] = twod[i][j];
      idx++;
    }
    mir++;

    return oned;
  }

  public static void fillTwodShellFromOned(int[] oned, int[][] twod, int s) {
    int rows = twod.length;
    int cols = twod[0].length;

    int mir = s - 1;
    int mic = s - 1;
    int mar = rows - s;
    int mac = cols - s;

    int idx = 0;

    // left wall | row increases from mir to mar, col stays at mic
    for (int i = mir, j = mic; i <= mar; i++) {
      twod[i][j] = oned[idx];
      idx++;
    }
    mic++;

    // bottom wall | row stays at mar, col increases from mic to mac
    for (int i = mar, j = mic; j <= mac; j++) {
      twod[i][j] = oned[idx];
      idx++;
    }
    mar--;

    // right wall | row decreases from mar to mir, col stays at mac;
    for (int i = mar, j = mac; i >= mir; i--) {
      twod[i][j] = oned[idx];
      idx++;
    }
    mac--;

    // top wall | row stays at mir, col decreases from mac to mic
    for (int i = mir, j = mac; j >= mic; j--) {
      twod[i][j] = oned[idx];
      idx++;
    }
    mir++;
  }

  public static void rotate(int[] oned, int r) {
    r = r % oned.length;
    if (r < 0) {
      r += oned.length;
    }

    reverse(oned, 0, oned.length - r - 1);
    reverse(oned, oned.length - r, oned.length - 1); // second half
    reverse(oned, 0, oned.length - 1); // full
  }

  public static void reverse(int[] oned, int left, int right) {
    while (left < right) {
      int temp = oned[left];
      oned[left] = oned[right];
      oned[right] = temp;

      left++;
      right--;
    }
  }

  public static void display(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }
  }
}
/*
Ring Rotate
Easy

You are given a n*m matrix where n are the number of rows and m are the number of columns. You are also given n*m numbers representing the elements of the matrix.
You will be given a ring number 's' representing the ring of the matrix. For details, refer to image.

shell-rotate

You will be given a number 'r' representing number of rotations in an anti-clockwise manner of the specified ring.
You are required to rotate the 's'th ring by 'r' rotations and display the rotated matrix.

Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
0 < s <= min(n, m) / 2
-10^9 <= r <= 10^9

Format
Input
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements of array a
A number s
A number r

Output
output is handled by display function

Example
Sample Input

5
7
11
12
13
14
15
16
17
21
22
23
24
25
26
27
31
32
33
34
35
36
37
41
42
43
44
45
46
47
51
52
53
54
55
56
57
2
3

Sample Output
11 12 13 14 15 16 17
21 25 26 36 46 45 27
31 24 33 34 35 44 37
41 23 22 32 42 43 47
51 52 53 54 55 56 57
*/
