 //                  *
//  	        *
//  		*
//  	*
// *


 import java.util.*;
 public class Pattern_8{
     public static void main(String[] args){
         Scanner scn = new Scanner(System.in);
         int n = scn.nextInt();

         for(int i =1; i<=n; i++){
             
             // Type 1 for spaces
             for(int j = 1; j<=(n-i); j++){
                 System.out.print("\t");
             }
            
            // Type 2 for Stars
            System.out.print("*\t");
            System.out.println();


         }
     }
 }
 