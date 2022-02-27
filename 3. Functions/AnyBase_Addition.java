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