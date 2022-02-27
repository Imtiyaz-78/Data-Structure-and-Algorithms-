
import java.io.*;
import java.util.*;

public class SubtractionOf2dMatrix {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    int n1 = scn.nextInt();
    int m1 = scn.nextInt();
    int[][] arr1 = new int[n1][m1];
    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[0].length; j++) {
        arr1[i][j] = scn.nextInt();
      }
    }


    int n2 = scn.nextInt();
    int m2 = scn.nextInt();
    int[][] arr2 = new int[n2][m2];
    for (int i = 0; i < arr2.length; i++) {
      for (int j = 0; j < arr2[0].length; j++) {
        arr2[i][j] = scn.nextInt();
      }
    }


    if(m1 !=m2 && n1 != n2){
        System.out.print("Invalid Input");

    }


    int [][] Subtraction = new int [n1][n2];
    for(int i = 0; i < Subtraction.length; i++){
        for(int j = 0; j < Subtraction[0].length; j++){
           
           Subtraction[i][j] = arr1[i][j] - arr2[i][j];
        }
    }
    

    


    for(int i = 0; i< Subtraction.length; i++){
        for(int j = 0; j < Subtraction[0]. length; j++){
            System.out.print(Subtraction[i][j] + " ");
        }


        System.out.println();
    }

  }
}
