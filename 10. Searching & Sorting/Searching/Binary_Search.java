import java.io.*;
import java.util.*;

public class Binary_Search {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int foundAt = -1;

        while (left <= right) {
            int mid = ((left + right) / 2);

            if (target > arr[mid]) {
                left = mid + 1;
            }

            else if (target < arr[mid]) {
                right = mid - 1;
            }

            else {
                foundAt = arr[mid];
                break;
            }
        }

        if (foundAt == -1) {
            System.out.println("element not found");
        } else {
            System.out.println("Target Element in Array index Number : " + foundAt);
        }

      

    }

}