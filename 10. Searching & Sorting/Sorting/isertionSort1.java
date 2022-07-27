
// This is best method of insertion Sort
import java.io.*;
import java.util.*;

public class isertionSort1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        for (int i = 1; i <= arr.length - 1; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int val : arr) { // for(int i = 0; i<arr.length; i++){ val = arr[i]}
            System.out.print(val + " ");
        }

        System.out.println(".");
    }
}


/*
Insertion Sort
Easy

1. You are given an array(arr) of integers.
2. You have to sort the given array in increasing order using insertion sort.

Constraints
1 <= N <= 10000
-10^9 <= arr[i] <= 10^9

Format:-

Input
An Integer n 
arr1
arr2..
n integers

Example
Sample Input

5
7 
-2 
4 
1 
3

Sample Output:-

Comparing -2 and 7
Swapping 7 and -2
Comparing 4 and 7
Swapping 7 and 4
Comparing 4 and -2
Comparing 1 and 7
Swapping 7 and 1
Comparing 1 and 4
Swapping 4 and 1
Comparing 1 and -2
Comparing 3 and 7
Swapping 7 and 3
Comparing 3 and 4
Swapping 4 and 3
Comparing 3 and 1

-2
1
3
4
7

*/

