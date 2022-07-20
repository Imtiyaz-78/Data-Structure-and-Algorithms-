import java.io.*;
import java.util.*;
import java.lang.*;

public class Target_Sum_Pair {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int target = scn.nextInt();
        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i = 0; i< arr.length; i++){
            arr[i] = scn.nextInt();
        }
        // Sort Array
        Arrays.sort(arr); // time nlon

        // meet in the middle
        int left = 0;
        int right = arr.length - 1;

        while (left < right) { // n
            if (arr[left] + arr[right] > target) {
                right--;
            } else if (arr[left] + arr[right] < target) {
                left--;
            }

            else {
                System.out.println(arr[left] + "+" + arr[right]);
                left++;
                right--;
            }
        }
    }
}

// Total Time Complexity:- nlogn + n = nlogn 
