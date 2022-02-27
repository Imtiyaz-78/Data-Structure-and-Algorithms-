
import java.util.*;

public class Search_ElementI_In2dMatrix {

  public static void main(String[] args) { 
    Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();

    int[][] arr = new int[n][n];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = scn.nextInt();
      }
    }

    int x = scn.nextInt();

    int i = 0;
    int j = arr[0].length - 1;
    while (i < arr.length && j >= 0) {
      if (x > arr[i][j]) { // Agar Target elemnt bada hai toh niche ki taraf aana hai yani towards row top to bottom
        i++;
      } else if (x < arr[i][j]) { // Agar Target element chhota hai toh left ki taraf yani column
        j--;
      } else {
        System.out.println(i);
        System.out.println(j);
        return;
      }
    }

    System.out.println("Not Found");
  }
}


/*
Search In A Sorted 2d Array
Medium

1. You are given a number n, representing the number of rows and columns of a square matrix.
2. You are given n * n numbers, representing elements of 2d array a. 
Note - Each row and column is sorted in increasing order.
3. You are given a number x.
4. You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below.
5. In case element is not found, print "Not Found".

Constraints
1 <= n <= 10^2
-10^9 <= e11, e12, .. n * m elements <= 10^9
All rows and columns are sorted in increasing order

Format
Input
A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a
A number x

Output
row
col of the location where element is found or "Not Found" if element is not in the matrix

Example
Sample Input

4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44
43

Sample Output
3
2
*/
