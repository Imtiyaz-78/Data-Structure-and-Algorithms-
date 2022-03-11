


import java.io.*;
import java.util.*;

public class SubSet_Of_Array{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();


    int [] arr = new int[n];

    for(int i = 0; i<n; i++){
        arr[i] = scn.nextInt();
    }


    // This is calculate 2 ^n Becasue Subset = 2^n.
    int lim = (1<<n);


    for(int i = 0; i < lim; i++){
        int dec = i;
    

     // Binary of decimal and if rem is 0 don't print other wise print element
      String str = "";
     for(int j = 0; j < arr.length; j++){  // This Loop is use to convert decimal to binary  
        int rem = dec % 2;
        dec = dec / 2;

        if( rem == 0){
            str = "-\t" + str;

        }
         

        else{
            str = arr[arr.length - 1 - j] + "\t" + str;

               }
        
          }


          System.out.println(str);

       }

    }


}

//SubSet_Of_Array
/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to print all subsets of arr. Each subset should be
on separate line. For more clarity check out sample input and output.         

Constraints
1 <= n <= 10
0 <= n1, n2, .. n elements <= 10^3

Format
Input
A number n
n1
n2
.. n number of elements

Output
[Tab separated elements of subset]
..
All subsets

Example
Sample Input

3
10
20
30

Sample Output
-	-	-	
-	-	30	
-	20	-	
-	20	30	
10	-	-	
10	-	30	
10	20	-	
10	20	30	

*/     
      
      


