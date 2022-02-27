

    /*
    1. You are given a number n, representing the size of array a.
    2. You are given n numbers, representing elements of array a.

    Asssumption - Array is sorted. Array may have duplicate values.

    Constraints
    1 <= n <= 1000
    1 <= n1, n2, .. n elements <= 100
    1 <= d <= 100

    Format
    Input
    A number n
    n1
    n2
    .. n number of elements
    A number d

    Output
    A number representing first index
    A number representing last index

    Example
    Sample Input

    15 
    1
    5
    10
    15
    22
    33
    33
    33
    33
    33
    40
    42
    55
    66
    77
    33

    Sample Output
    5
    9
    */

import java.io.*;
import java.util.*;

public class Fi_and_Li { 

public static void main(String[] args) throws Exception {
    // write your code here

    Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }


        int target = scn.nextInt();

        // This is For First Index
        int left = 0;
        int right = arr.length - 1;
        int First_idx = -1;

        while(left <= right) {
            int mid = ((left + right) /2);

            if(target > arr[mid]){
                left = mid + 1;
            }

            else if(target < arr[mid]){
                right = mid - 1;
            }

            else{

                First_idx = mid;
               
                
            }

        }

         System.out.println(First_idx);
        
        
        // This is for Last index
         left = 0;
         right = arr.length - 1;
         int Last_idx = -1;

        while(left <= right){
            int mid = ((left + right) /2);

            if(target > arr[mid]){
                left = mid + 1;
            }

            else if(target < arr[mid]){
                right = mid - 1;
            }

            else{

                Last_idx = mid;
                left = mid + 1;
                
            }
        }

         System.out.print(Last_idx);


   }

}