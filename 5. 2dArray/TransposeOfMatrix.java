
import java.io.*;
import java.util.*;

public class TransposeOfMatrix {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n1 = scn.nextInt();
    int m1 = scn.nextInt();

    int[][] arr = new int[n1][m1];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = scn.nextInt();
      }
    }


    System.out.println("Transpose Of Matrix:");
    for (int i = 0 ; i < n1; i++) {   // or i < arr[0].length
      for (int j = 0; j < arr.length; j++) {  // j < arr.length
        
        System.out.print( arr[j][i] + " ");
       
      }

      System.out.println();
    }

    
  }
}
