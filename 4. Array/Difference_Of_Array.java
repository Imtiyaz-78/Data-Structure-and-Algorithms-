
    /*
    1. You are given a number n1, representing the size of array a1.
    2. You are given n1 numbers, representing elements of array a1.
    3. You are given a number n2, representing the size of array a2.
    4. You are given n2 numbers, representing elements of array a2.
    5. The two arrays represent digits of two numbers.
    6. You are required to find the difference of two numbers represented by two arrays and print the arrays. a2 - a1

    Assumption - number represented by a2 is greater.

    Constraints
    1 <= n1, n2 <= 100
    0 <= a1[i], a2[i] < 10
    number reresented by a1 is smaller than number represented by a2

    Format
    Input
    A number n1
    n1 number of elements line separated
    A number n2
    n2 number of elements line separated

    Output
    A number representing difference of two numbers (a2 - a1), represented by two arrays.

    Example
    Sample Input
    3 // Size Of Array
    2
    6
    7
    4 // Size Of Array 
    1
    0
    0
    0

    Sample Output
    7
    3
    3 
    
    */


 import java.util.*;
 import java.io.*;

 public class Difference_Of_Array{

     public static void main(String[] args) throws Exception{
         Scanner scn = new Scanner( System.in);
         
         int n1 = scn.nextInt();
         int [] arr1= new int[n1];
         for(int i = 0; i<arr1.length; i++){
             arr1[i] = scn.nextInt();
         }


         int n2 = scn.nextInt();
         int [] arr2 = new int[n2];
         for(int i = 0; i<arr2.length; i++){
             arr2[i] = scn.nextInt();
         }

         
         // Difference 
         int [] diff = new int[ n2];

         int i = arr1.length - 1;
         int j = arr2.length - 1;
         int k = diff.length - 1;


         int carry = 0;
         while( k>=0){
             int d = arr2[j] - carry;
             if(i >= 0){
                 d = d - arr1[i];
             }
             
             if(d < 0){
                 d = d + 10;
                 carry = 1;
             }

             else{
                 //nothing
                 carry = 0;
             }

            diff[k] = d;
         
          i--;
          j--;
          k--;


         }
         
         // Don't Print Leading Zeroes
         int idx = 0;
         while( idx < diff.length){
             if(diff[idx] != 0){
                 break;
             }

             else{
                 carry = 0;
             }


             idx++;
         }
        
         
         while(idx < diff.length){
             System.out.print(" Difference Of Two Arrays " + diff[idx]);

              idx++;
         }

         
     }
 }