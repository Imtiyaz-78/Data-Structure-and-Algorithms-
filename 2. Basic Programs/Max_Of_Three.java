import java.util.*;
import java.io.*;

public class Max_Of_Three{
    public static void main(String[] args){
        // write your code here 
        Scanner Scn = new Scanner(System.in);
        int a = Scn.nextInt();
        int b = Scn.nextInt();
        int c = Scn.nextInt();

      int result = ( a > b ) ? (a > c ? a : c) : ( b > c ? b : c);
      System.out.println( "Max Number: "+result);

     
    }

    }
