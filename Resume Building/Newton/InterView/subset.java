
import java.util.*;
import java.io.*;

// Java program to find whether an array is subset of another array

public class subset {

    // Return true if arr2[] is a subset of arr1[]

    public static boolean isSubset(int arr1[], int arr2[], int m, int n) {

        int i = 0;
        int j = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++)
                if (arr2[i] == arr1[j])
                    break;

            // If the above inner loop was not broken at all then was not broken at all then
            // arr2[i] arr1[]is not present in

            if (j == m)
                return false;
        }

        // If we reach here then all elements of arr2[] are present elements of arr2[]
        // are present in arr1[]

        return true;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int m = scn.nextInt();
        int arr1[] = new int[m];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }

        int n = scn.nextInt();
        int arr2[] = new int[n];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }

        if (isSubset(arr1, arr2, m, n))
            System.out.print("arr2[] is " + " subset of arr1[] ");

        else
            System.out.print("arr2[] is " + " not a subset of arr1[] ");

    }
}
