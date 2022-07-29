

import java.io.*;
import java.util.*;

public class negative {

    public static void partition(int[] arr, int n) {
        // write your code here
        int i = 0;
        int j = 0;

        while (i < arr.length) {
            if (arr[i] < 0  ) {
                i++;

            } else {
                swap(arr, i, j);
                i++;
                j++;
            }

        }

    }

    public static void swap(int arr[], int i, int j) {
        System.out.println("Swapping " + arr[i] + " and " + arr[j]);
        int tamp = arr[i];
        arr[i] = arr[j];
        arr[j] = tamp;
    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }


        partition(arr, n);
        print(arr);
    }

}

