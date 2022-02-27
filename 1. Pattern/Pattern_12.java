 // 0
 // 1
 // 1   2
 // 3   5
 // 8   13   21


 import java.util.*;

  public class Pattern_12 {
     public static void main(String[] args){
         Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();

         int a = 0;
         int b = 1;
         int c;
          
          for(int i = 1; i<=n; i++){
             for(int j = 1; j<=i; j++ ){
                  
                 System.out.print(a+"\t");
                   c = a+b; // Since Next Febonacci Number si Sum of 
                   a = b;   // Previous two Febonacci Number b = c ;
                   b = c;
             }

             System.out.println();
         }
     }
 }