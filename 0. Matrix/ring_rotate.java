

import java.io.*;
import java.util.*;

public class ring_rotate {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][]arr = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            int li = 0;
            int ri = n-1;
            while(li<ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }
        }
        display(arr);


        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            int li = 0;
            int ri = n-1;
            while(li<ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }
        }


        display(arr);

    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}




/*
Problem Statement
Given a matrix of N*N dimensions (Mat). Print the matrix rotated by 90 degree and 180 degree.
Input
First line contains N.
N lines follow each containing N space seperated integers.

2 <= N <= 100
1 <= Mat[i][j] <= 10000
Output
Output 2*N+1 lines.
First N lines should contain the Matrix rotated by 90 degrees.
Then print a blank line.
Then N lines should contain the Matrix rotated by 180 degrees.
Example
Sample Input

2
3 4
7 6

Sample Output
7 3
6 4

6 7
4 3

Sample Input:
2
1 2
3 4

Sample Output:
3 1
4 2

4 3
2 1

*/