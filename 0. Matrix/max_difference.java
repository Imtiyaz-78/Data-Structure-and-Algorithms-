
import java.util.*;

public class max_difference {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        
        int res = -1;

        for(int i=0;i<n;i++){
            int j=n-1;
            while(j>i && arr[j]<arr[i]){
                j--;
            }
            if(j!=i){
                res=Math.max(res, j-i);
            }
        }
        System.out.println(res);
      

    }
}





/*
 * abstract
 * Maximum difference array
 * 
 * Time Limit: 2 sec
 * Memory Limit: 128000 kB
 * 
 * Problem Statement
 * 
 * Given an array of integers of size N, your task is to find the maximum parity
 * index of this array.
 * Parity Index is the maximum difference between two indices i and j (1 <= i <=
 * j <= N) of an array A such that Ai < Aj.
 * 
 * Input
 * First line of contains a single integer N, next line contains N space
 * separated integers depicting the values of array.
 * 
 * Constraints:-
 * 1 < = N < = 100000
 * 1 < = Arr[i] < = 100000
 * 
 * Output
 * 
 * Print the maximum value of j- i under the given condition, if no pair
 * satisfies the condition print -1.
 * 
 * Example
 * 
 * Sample Input:-
 * 5
 * 1 2 3 4 5
 * 
 * Sample Output:-
 * 4
 * 
 * Explanation:
 * The maximum difference of jth - ith index is 4:(4th - 0th), also arr[4] >
 * arr[0]
 * 
 * 
 * Sample Input:-
 * 5
 * 5 4 3 2 1
 * 
 * Sample Output:-
 * -1
 * 
 * 
 */


