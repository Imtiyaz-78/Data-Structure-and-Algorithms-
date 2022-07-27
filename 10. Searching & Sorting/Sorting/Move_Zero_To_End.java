
import java.util.*;
import java.io.*;

public class Move_Zero_To_End {

    public static void sort(int arr[], int n) {

        int i = 0;
        int j = 0;
        while (i < arr.length) {
            
            if (arr[i] == 0) {
                i++;

            } 
            
            else if (arr[i] != 0) {
                swap(arr, j , i);
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

        sort(arr, n);
        print(arr);
    }
}
