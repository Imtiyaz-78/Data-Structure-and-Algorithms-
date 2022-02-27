import java.util.*;
import java.io.*;

public class Prime_Fectorization {
     public static void main(String[] args) {
    // write your code here 

    Scanner Scn = new Scanner(System.in);
    int n = Scn.nextInt();

  
    for(int div = 2; div<=n; div++){
      while(n%div==0){
         n = n/div;
         System.out.print(div+ " ");

    }
  } 
 }
}