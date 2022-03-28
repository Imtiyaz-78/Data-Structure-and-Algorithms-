import java.util.*;
  
  public class Anybase_To_Decimal{

   public static int getValueInBase(int n, int b){
       // write code here
       
       int result  = 0;
       int multiplier = 1;
       while(n>0){

           int divisor = n/10;
           int remender = n%10;

            n = divisor ;
            
            result = result + remender * multiplier;
             multiplier = multiplier *b;
    
       }
             
        return result;
      
   }
  

  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
  }
  /* 

  Any Base To Decimal
Easy

1. You are given a number n.
2. You are given a base b. n is a number on base b.
3. You are required to convert the number n into its corresponding value in decimal number system.

Constraints
0 <= d <= 1000000000
2 <= b <= 10

Format
Input
A number n
A base b

Output
A decimal number representing corresponding value of n in base b.

Example
Sample Input

111001
2

Sample Output
57
  */