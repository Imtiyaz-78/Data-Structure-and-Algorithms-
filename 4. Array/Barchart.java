  
    
    // This is very Important for any Pattern Problem. 
    // Printing Start Height According to Number.

    
    //    5 // size of Array

    //    3
    //    1
    //    0
    //    7
    //    5

    // Output:-
                		
    //                      *		
    //                      *	 *	
    //                      *	 *	
    //      *		        *	 *	
    //      *		 	    *	 *	
    //      *	   *        *	 *	


    import java.io.*;
    import java.util.*;
    import java.util.Scanner;

    public class Barchart{

        public static void main(String[] args) throws Exception {
            // write your code here
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            int []arr = new int[n];

            for(int i = 0; i<arr.length; i++){
                arr[i] = scn.nextInt();
            }

            // Part 2
            int max = arr[0];
            for(int i = 1; i<arr.length; i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }

            // For Printing Shape;
            for(int ht = max; ht>= 1; ht--){
                for(int i = 0; i<arr.length; i++){
                    if(arr[i] >= ht){
                    System.out.print("*\t");
                    
                    }else{
                        System.out.print("\t");
                    }
                }

          
                System.out.println();
            
            }


        }

   }

