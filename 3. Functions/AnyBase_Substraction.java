import java.util.*;
  
  public class AnyBase_Substraction{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  

   public static int getDifference(int b, int n1, int n2){
       // write your code here
         
         int res = 0;
         int carry = 0;
         int multiplier = 1;


         while( n2 > 0 ) {

           int d1 = n1%10;
           int d2 = n2%10;

           n1 = n1/10;
           n2 = n2/10;

           int result = d2 - carry - d1;
          
           if(d<0){
             carry = 1;
             d = d+b;
           }

           else {
             carry = 0;
           }

           res = res + result * multiplier;
           multiplier = multiplier *10;
         }

         return res;

    }
  
  }