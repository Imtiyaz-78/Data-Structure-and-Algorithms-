
import java.util.*;
import java.io.*;

public class MoveNegativeToEnd {

    // Moves all -ve element to end of array in
    // same order.
    public static void movenegativeToend(int arr[], int n) {

        int temp[] = new int[n];

        int j = 0; // index of temp

        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                temp[j++] = arr[i];
            }
        }

        if (j == n || j == 0) {
            return;
        }

        // Store Negative element in temp array
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                temp[j++] = arr[i];
            }
        }
        // Copy element of temp[] to arr[]
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        movenegativeToend(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
