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