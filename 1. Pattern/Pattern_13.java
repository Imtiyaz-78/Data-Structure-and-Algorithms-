 

/*
1. You are given a number n.
2. You've to create a pattern as shown in output format
                                                       

Constraints
1 <= n <= 10

Format
Input
A number n

Output
pat131

Example
Sample Input

5 // Size of Input

Sample Output
1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1

*/

 import java.util.*;
 
  public class Pattern_13{

     public static void main(String[] args){
         Scanner scn = new Scanner(System.in);
        
         //write your code here

         int n = scn.nextInt();

         for(int i = 0; i < n; i++){
             int val = 1;
             // nck+1 = nck * (n -k)/(k+1)
             for(int j = 0; j <= i; j++){
                 System.out.print(val + "\t");
                 val = val * (i - j) / (j + 1);
             }

             System.out.println();
         }
        
    
        
    }
}