import java.util.*;
import java.io.*;
// Java program to find first non-repeating

public class non_repeat {
    // 7 8 3 1 2 7

    public static int firstNonRepeating(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int j;
            int count = 0;
            for (j = 0; j < n; j++)
                if (i != j && arr[i] == arr[j]){
                    break;
                }
               
                   if (j == n)
                     return arr[i];
        }

        return -1;
    }

    

    public static void main(String[] args) {

        // int arr[] = { 9, 4, 9, 6, 7, 4 };
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.print(firstNonRepeating(arr, n));

    }

}
