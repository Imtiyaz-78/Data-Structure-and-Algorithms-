
// incomplete


import java.io.*;
import java.util.*;

public class InsertElementInArray {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n  = scn.nextInt();
    int[] arr = new int[n + 1];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }

    int target = scn.nextInt();
    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
      for (int i = 0; i < arr.length; i++) {
        int mid = (left + right) / 2;

        if (target > arr[mid]) {
            left = mid + 1;
        }

          else if(target < arr[mid]){
                right = mid - 1;
            }
            
            else{
                for( i = arr.length - 1; i>mid + 1; i--){

                }
                
            }


        left++;
        right--;
      }

      for(int i = 0; i < arr.length; i++){
          System.out.print(arr[i] + " ");
      }

    }
  }
}
