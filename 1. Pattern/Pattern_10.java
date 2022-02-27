// 	     	*	
//  	*		*	
//  *				*	

//  	*		*	
//	    	*
// Source code in java 
import java.util.*;

public class Pattern_10{

public static void main(String[] args) {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     
     // upper Bond
     // write ur code here
     
     for(int i=1; i<=(n/2 + 1); i++){
         
         // Type 1 for Spaces
        for(int j=1; j<= (n/2 + 1)-i; j++){
            System.out.print("\t");
        } 
        
        //Type 2 for stars 
        System.out.print("*\t");
         
         // Type 3 for spaces
        for(int j=1; j<= 2*(i-1)-1; j++){
            System.out.print("\t");
        }
        
        // Type 4 for Stars
        if(i!=1){
            System.out.print("*\t");
        }
        
        System.out.println();
    }
    
    
    // Lower Bond
    for(int i=1;i<=n/2;i++)
    {
       // Type 1 for Spaces
       for(int j=1;j<=i;j++)
        {
            System.out.print("\t");
            
        }
        
        
        // Type 2 For Stars
        System.out.print("*\t");
        
        // Type 3 for Spaces
        for(int j=1;j<=(n/2-1);j++)
        {
            System.out.print("\t");
        }
       
        //Type 4 for Stars 
        if(i!=(n/2))
        {
            System.out.print("*\t");
        }
        System.out.println();
    }
  
      // by Navdeep Sir
   
   /* Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     // write ur code here
     //upper half 
     for ( int i= 1 ; i<=(n/2+1);i++){
         
         for ( int j = 1; j<=(n/2+1)-i;j++){
             System.out.print("\t");
         }
         System.out.print("*\t");
         
         for ( int j= 1;j<=(2*(i-1)-1);j++){
             System.out.print("\t");
         }
        if ( i!=1 ){
         System.out.print("*\t");
        }
         
     
     System.out.println();
     }


//lower half


     for ( int i=1 ; i<=n/2; i++){
         
         for ( int j = 1 ; j<=i; j++){
             System.out.print("\t");
         }
         System.out.print("*\t");
         for (int j= 1 ; j<=(n/2-1);j++){
             System.out.print("\t");
         }
         if ( i != n/2){
         System.out.print("*\t");
         }
          System.out.println("\t");

}*/


 }
}