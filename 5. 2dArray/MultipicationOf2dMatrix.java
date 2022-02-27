import java.io.*;
import java.util.*;

public class MultipicationOf2dMatrix {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // Matrix 1
    int n1 = scn.nextInt();
    int m1 = scn.nextInt();
    int[][] arr1 = new int[n1][m1];

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[0].length; j++) {
        arr1[i][j] = scn.nextInt();
      }
    }

    // Matrix 2
    int n2 = scn.nextInt();
    int m2 = scn.nextInt();
    int[][] arr2 = new int[n1][m1];

    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < arr2[0].length; j++) {
        arr2[i][j] = scn.nextInt();
      }
    }

    if (m1 != n2) {
        System.out.print("Invalid Input");
    }

    int[][] Multiplication = new int[n1][m2];
    for (int i = 0; i < Multiplication.length; i++) {
      for (int j = 0; j < Multiplication[0].length; j++) {
        int val = 0;

        for (int k = 0; k < m1; k++) { // Column 
          val = val + arr1[k][i] * arr2[k][j];
        }

        Multiplication[i][j] = val;
      }
    }


    for (int i = 0; i < Multiplication.length; i++) {
      for (int j = 0; j < Multiplication[0].length; j++) {
        System.out.print(Multiplication[i][j] + " ");
      }

      System.out.println();

    }
  }
}
