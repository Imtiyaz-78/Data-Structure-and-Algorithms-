import java.util.Scanner;
import java.io.*;
import java.util.*;

public class Check_duplicates {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        Arrays.sort(arr); // nlog(n)
        int dup = -1;
        int i = 0;
        for (i = 0; i < arr.length - 1; i++) { // n
            if (arr[i] == arr[i + 1]) {
                dup = arr[i];
                break;
            }
        }

        // System.out.println(dup ==arr[i]);
        if (dup == arr[i]) {
            System.out.println(dup);
        } else {
            System.out.println(" Not duplicates element in a Array");
        }

    }
}

/*
 * sample input
 * 5
 * 1 2 3 1 5
 * 
 * output
 * 1
 * 
 * Time Complexity :- total (nlogn + n) n is small term eliminates so total time
 * = nlogn
 * 
 */