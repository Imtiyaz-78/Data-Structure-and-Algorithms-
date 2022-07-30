
import java.io.*;
import java.util.*;

public class RadixSort {

    public static void radixSort(int[] arr) {
        // write code here
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int place = 1;
        while (max / place > 0) { // ye loop jb 223/0 = 0 that means 0 > 0 false then break 
            countSort(arr, place);
            place = place * 10;
        }
    }

    public static void countSort(int[] arr, int exp) {
        // write code here
        // Creating the frequency array and the answer array
        int[] farr = new int[10];
        int[] ans = new int[arr.length];

        // collecting the frequencies
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i] / exp % 10;
            farr[val]++;
        }

        // convert the freq to psa
        for (int i = 1; i < farr.length; i++) {
            farr[i] += farr[i - 1];
        }

        // fill the ans
        for (int i = arr.length - 1; i >= 0; i--) {
            int val = arr[i] / exp % 10;
            int pos = farr[val];
            ans[pos - 1] = arr[i];
            farr[val]--;
        }

        // Fill the original array
        for (int i = 0; i < ans.length; i++) {
            arr[i] = ans[i];
        }

        System.out.print("After sorting on " + exp + " place -> ");
        print(arr);
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        radixSort(arr);
        print(arr);
    }

}

/*
Radix Sort
Easy

1. You are given an array(arr) of integers.
2. You have to sort the given array in increasing order using radix sort.

Constraints
1 <= N <= 10000
0 <= arr[i] <= 10^8

Format
Input
An Integer n 
arr1
arr2..
n integers

Output
Check the sample ouput and question video.

Example
Sample Input

5
7 
2 
4 
1 
3

Sample Output
After sorting on 1 place -> 1 2 3 4 7 
1 2 3 4 7
*/