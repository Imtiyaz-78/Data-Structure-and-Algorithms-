
/*
1. You are given a number n.
2. You've to write code to print the pattern given in output format below.

Constraints
1 <= n <= 10
 Also, n is odd.

Format
Input
A number n

Output
pat201

Example

Sample Input
5 // Size Of Input

Sample Output
*                               *
*                               *
*               *               *
*       *               *       *
*                               *

*/

import java.util.*;

public class Pattern_20{

public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
  
     for(int i = 1; i <= n ; i++){
         for(int j = 1; j <= n; j++){
              
            if(j == 1 || j == n) {  // For First Column and Last Column
                System.out.print("*\t");

         } 
         
         else if ( i > n /2  && (i == j || i+j == n + 1)){ // 2nd Half Diagonal

            System.out.print("*\t");

         }
         
         else{
              System.out.print("\t");
            
              }

         }

          System.out.println();
     
      }

   }

}
     
