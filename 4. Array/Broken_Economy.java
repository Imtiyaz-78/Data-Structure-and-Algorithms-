 


import java.util.*;
import java.io.*;

public class Broken_Economy{

    public static void main( String[] args){
        Scanner scn =  new Scanner( System.in);
        int n = scn.nextInt();

        int [] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
         

         int data = scn.nextInt();

        int left = 0;
        int right = arr.length - 1;
        int ceil = -1;
        int floor = -1;

        while(left <= right){

            int mid = ( (left + right) / 2) ;

            if(data > arr[mid]){
                left = mid + 1;
                floor =  arr[mid];
            }

            else if(data < arr[mid]){
                  right = mid - 1;
                  ceil = arr[mid];

            }

            else{
                ceil = arr[mid];
                floor = arr[mid];
                break;

            }


        }
          

          System.out.println();
          System.out.println(ceil);
          System.out.println(floor);

        
        
    }
}