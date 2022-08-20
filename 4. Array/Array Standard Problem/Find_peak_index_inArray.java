
import java.util.*;
import java.io.*;

public class Find_peak_index_inArray {

    public static int peak(int arr[], int n) {
        if (n == 1) { // base 
            return 0;
        }

        Arrays.sort(arr);
        if (arr[0] >= arr[1])
            return 0;

        if (arr[n - 1] >= arr[n - 2]) {
            return n - 1;

        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }

        return 0;
    }
    

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(peak(arr, n));
    }
}



// Input
// n
// 20 10 3 40 50
// output ----> 4 (index Number )

// Return Peak index In Array
