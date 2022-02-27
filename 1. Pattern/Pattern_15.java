
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
pat151

Example
Sample Input

5

Sample Output
		1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	


*/

import java.util.*;

public class Pattern_15 {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        // write your code here
        
        int n = sc.nextInt();

        int stars = 1;
        int spaces = n /2;
          int val = 1;
        for(int i = 1; i <= n; i++){
          
            for(int j = 1; j <= spaces; j++){
                System.out.print("\t");
            }
              
            int ival = val;
             for(int j = 1; j <= stars; j++){
                System.out.print(ival + "\t");
                
                if(j <= stars / 2){
                   ival++;
                }
                else{
                    ival--;
                }
             }

            if(i<=n/2){
                stars += 2;
                spaces--;
                val++;
            }
            
            else{
                stars -= 2;
                spaces++;
                val--;
            }
            
            
            System.out.println(); 
        } 
         

    }
}
