
import java.util.*;
import java.io.*;

public class hippy {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        for(int i = 0, j=arr.length-1; i<j; i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        
        int even = 0, odd = 1;
        // Loop to find even, odd sum
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 1)
                even += arr[i];
            else
                odd = odd * arr[i];
        }
 
        System.out.println(even + " " + odd);

        
    }
}


/*
Hip Hip Array
Time Limit: 2 sec
Memory Limit: 128000 kB

Problem Statement
You will be given an array of N numbers. Your task is to first reverse the array (first number becomes last, 2nd number becomes 2nd from the last and so on) and then print the sum of the numbers at even indices and print the product of the numbers at odd indices.

Input
First line contains single integer N: number of elements
Second line contains N different integers separated by spaces

constraints:-
1 <= N <= 35
1 <= a[i] <= 10
Output
Two space separated integers representing sum of the numbers at even places and the product of the numbers at odd places.

Example
Sample Input:
6
1 2 3 4 5 6

Sample Output:
9 48

Explanation:-
After reversing 1 2 3 4 5 6 becomes 6 5 4 3 2 1
Hence sum of the numbers at even indices : 5+3+1=9
product of the numbers at odd indices: 6*4*2=48

Sample Input:
3
1 2 3

Sample Output:
2 3

*/

