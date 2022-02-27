 import java.util.*;
 import java.io.*;
 
  // Printing V shape 
  public class Pattern_5{
    public static void main(String[] args){
        Scanner Scn = new Scanner( System.in);
        int n = Scn.nextInt();
         
        // Upper Half Bond 
        // Write Your Code here
        
        int dec_counter = n/2;
        for(int i = 1; i<=(n/2)+1; i++){
            for(int j = 1; j<=dec_counter; j++){
              System.out.print("\t");
            }

            for(int j = 1; j<= 2*i-1; j++){
                System.out.print("*\t");
                }

               dec_counter--;

                System.out.println();

        }
       
       // Lower Half Bond 
       // Write Your Code Here 

       	int Inc_Count = 1;
	    for(int i = 1; i<=n/2; i++){
	      for(int j =  1; j<= Inc_Count; j++){
	          System.out.print("\t");
   	         }
	
	
         for(int j = 1; j<= n-2*i; j++){
	         System.out.print("*\t");
 	       }
	
	   Inc_Count++;
	   System.out.println();
	  }

    }
 }