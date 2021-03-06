import java.util.*;
import java.io.*;

public class Sort01 {

    public static void sort(int arr[], int n) {

        int i = 0;
        int j = 0;
        while(i < arr.length){
            if(arr[i]== 1){
                i++;

            } else {
                swap(arr, i, j);
                i++;
                j++;
            }
        }

    }

    public static void swap(int arr[], int i, int j) {
        if (arr[i] < arr[j]) {
            int tamp = arr[i];
            arr[i] = arr[j];
            arr[j] = tamp;
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        sort(arr, n);
        print(arr);
    }
}

/*
 * Sort 01
 * Easy
 * 
 * 1. You are given an array(arr) containing only 0's and 1's.
 * 2. You have to sort the given array in increasing order and in linear time.
 * Without extra Spaces
 * 
 * 
 * Constraints
 * 1 <= N <= 10000
 * arr[i] = 0,1
 * 
 * Format
 * Input
 * An Integer N
 * arr1
 * arr2..
 * n integers
 * 
 * Output
 * Check the sample output and question video.
 * 
 * Example
 * Sample Input
 * 
 * 5
 * 0
 * 1
 * 0
 * 1
 * 0
 * 
 * Sample Output
 * Swapping index 0 and index 0
 * Swapping index 2 and index 1
 * Swapping index 4 and index 2
 * 0
 * 0
 * 0
 * 1
 * 1
 */