// input 57
// 2
// ouput :- 111001

import java.util.*;
  
  public class Decimal_To_Anybase{

   public static int getValueInBase(int n, int b){
       // write code here
       
       int result  = 0;
       int multiplier = 1;
       while(n>0){

           int divisor = n/b;
           int remender = n%b;

            n = divisor ;
            
            result = result + remender * multiplier;
             multiplier = multiplier *10;
    
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