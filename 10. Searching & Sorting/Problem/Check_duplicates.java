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
        for (int i = 0; i < arr.length - 1; i++) { // n
            if (arr[i] == arr[i + 1]) {
                dup = arr[i];
                break;
            }
        }

        System.out.println(dup);

    }
}

/*
  Time Complexity :- total nlogn + n small term eliminates so total time nlogn
 
 */