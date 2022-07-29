
import java.util.*;
import java.io.*;

public class Even_Odd {

    public static void sort(int arr[], int n) {

        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] % 2 == 1) {
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
class Main {

public static void main(String[] args){

int[] arr = {1,2,3,4,5};

int[] ans = new int[arr.length];

int j = 0;

for(int i: arr){

if(i%2==0){

ans[j++] = i;

}

}

for(int i: arr){

if(i%2!=0){

ans[j++] = i;

}

}

for(int i: ans){

System.out.println(i);

}

}

}
 */
// 5
// 9 3 10 11 12
// output come 
// 10 12 9 3 11