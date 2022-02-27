import  java.util.*;
import java.io.*;


public class The_curious_case{
    public static void main(String[] args){
        Scanner Scn= new Scanner(System.in);
        int n = Scn.nextInt();
 
        for(int s_of_n = 1; s_of_n * s_of_n <= n; s_of_n++){
            int square = s_of_n * s_of_n;
            System.out.println(square);
        }

   }
  }