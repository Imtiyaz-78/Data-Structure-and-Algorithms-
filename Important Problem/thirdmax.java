
// Very Important Question 

import java.util.Arrays;
import java.util.Scanner;

public class thirdmax {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int temp;
        for (int i = 0; i < n; i++) { // Time O(n^2)
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Arrays.sort(arr); // Time O(logn)
        // int ans = Math.max(a, b);
        System.out.println(arr[n - 3] * arr[n - 2] * arr[n - 1]);
        System.out.println(arr[n - 2]); // second
    }
}