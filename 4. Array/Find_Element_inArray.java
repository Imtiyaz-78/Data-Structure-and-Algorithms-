  
  // Sample Input 
  // 3  Size of array
  // 20 30 40 
  // 40 Target Elemet

  // Sample Outout: 2

   
  import java.util.*;
  import java.io.*;
  import java.lang.*;
  import java.util.Scanner.*;

  public class Find_Element_inArray{
     
      public static void main( String[] args ) {
          Scanner scn = new Scanner( System.in );
          int n = scn.nextInt();

          int []arr = new int[n];


          for(int i = 0; i<arr.length; i++){
              arr[i] = scn.nextInt();
          }
          

          int foundAt = -1;
          int target = scn.nextInt();
          for(int i = 0; i < arr.length; i++){

              if(arr[i] == num){
                  foundAt = i;
                  break;
              } 

          }

       
       System.out.println();
       System.out.println( "Index Number which is Equal To Target Elemet : " + foundAt);

      }

  }