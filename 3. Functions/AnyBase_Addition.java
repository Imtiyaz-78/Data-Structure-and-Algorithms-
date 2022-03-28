import java.util.*;
  
  public class AnyBase_Addition{

      
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }


   public static int getSum(int b, int n1, int n2){
       // write ur code here

       int carry = 0;
       int result = 0;
       int multiplier = 1;

       while(  n1>0 && n2>0 ){

         int  d1 = n1 %10;
         int  d2 = n2 %10;

         int temp = carry + d1 + d2;
         int quotent = temp/b;   // This is for Quotent suppose carry + d1 + d2 = 7 then 7/8 = 0
         int remender = temp%b;  // This line for Remende Suppose 2%8 = remende 
 
         result = result + remender* multiplier;
         carry = quotent;

         multiplier = multiplier*10;
         n1 = n1/10;
         n2 = n2/10;

       }

       return result;
   }
  
   
  }
  /*

  Any Base Addition
Easy

1. You are given a base b. 2. You are given two numbers n1 and n2 of base b. 3. You are required to add the two numbes and print their value in base b.


Constraints
2 <= b <= 10 0 <= n1 <= 256 0 <= n2 <= 256


Format
Input
A base b A number n1 A number n2


Output
A number representing the sum of n1 and n2 in base b.


Example
Sample Input

8
777
1

Sample Output
1000
  */