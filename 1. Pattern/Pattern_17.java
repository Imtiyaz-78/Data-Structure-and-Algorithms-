   
  //         *
  //         *   *
  // *   *   *   *   *
  //         *   *
 

 
 import java.util.*;

 public class Pattern_17{

     public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // write ur code here
        
        // upper Half Bond 
        for(int i = 1; i<=((n/2)+1); i++){
            for(int j = 1; j<=(n/2); j++){

                if(i == ((n/2)+1)){
                    j = ((n/2));
                }

                else{
                    System.out.print("\t");

                }
             
            }

                for(int j = 1; j<=i; j++){
                    if(i == ((n/2)+1)){
                        i = n;
                    }

                    System.out.print("*\t");
                }
               
               System.out.println();
            
            }

        

       // Lower Half Bond 

       for(int i =(n/2); i>=1; i--){
           for(int j = 1; j<= (n/2); j++){
               System.out.print("\t");
           }

           for(int j = 1; j<=i; j++){
               System.out.print("*\t");
           }

           System.out.println();


       }

    }
}