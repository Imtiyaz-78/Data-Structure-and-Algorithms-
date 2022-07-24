import java.util.Scanner;
import java.util.*;
import java.io.*;

public class subset {

    public static void check(int arr1[], int arr2[], int n, int m) {
        int i = 0;
        int j = 0;
         
        int count= 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                if (arr1[i] == arr2[j]) {
                   count++;
                }
            }
        }

        if (count == m) {
           System.out.println("arr2[] is subset of arr1[]");
        }
        else{
            System.out.println("arr2[] is not subset of arr1[]");
        }

        

    }

    public static void main(String[] args) {
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

        check(arr1, arr2, m, n);

       

    }
}
