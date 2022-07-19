
import java.io.*;
import java.util.*;

public class Merge_two_sorted_array {

    public static int[] mergeTwoSortedArrays(int[] a, int[] b) {
        // write your code here

        int [] ans = new int [a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                ans[k] = a[i];
                i++;
                j++;
                k++;
            }else{
                ans[k] = a[j];
                j++;
                k++;
            }
        }

        if(i == a.length){
            while(j < b.length){
                ans[k] = a[j];
                j++;
                k++;
            }
        }else if(j == b.length){
            while(i < a.length){
              ans[k] = a[i];
              i++;
              k++;
            }
        }


        return ans;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scn.nextInt();
        }
        int[] mergedArray = mergeTwoSortedArrays(a, b);
        print(mergedArray);
    }

}
/*
Merge Two Sorted Arrays
Easy

1. You are given two sorted arrays(a,b) of integers.
2. You have to merge them and form one sorted array.
3. You have to do it in linear time complexity.

Constraints
1 <= N <= 10^8
-10^9 <= a[i],b[i] <= 10^9

Format
Input
An Integer n 
a1
a2..n integers
An integer m
b1
b2..m integers

Output
Check the sample output and question video.

Example
Sample Input

4
-2 
5 
9 
11
3
4 
6 
8

Sample Output
-2
4
5
6
8
9
11 */