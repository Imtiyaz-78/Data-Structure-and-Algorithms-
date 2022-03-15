// import java.io.*;
import java.util.*;

public class Display_Of_Array {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int []arr = new int[n];
        for(int i = 0 ; i < arr.length; i++){
            arr[i] = scn.nextInt();
           
        }


         displayArr(arr, 0);

         scn.close();

    }
   
    // Expectation => da(arr, idx) => arr[idx] arr[idx + 1] .. arr[n - 1]
    // Faith    => da(arr, idx + 1) => arr[idx + 1] arr[idx + 2] .. arr[n-1]
    // EWF      => da(arr, idx) => arr(idx) da(arr, idx + 1)    
    public static void displayArr(int[] arr, int idx){

        if(idx == arr.length){ // This is base Case
            return;
        }

        System.out.println(arr[idx]); // idx means index
        displayArr(arr, idx+1);
        
    }

  

}