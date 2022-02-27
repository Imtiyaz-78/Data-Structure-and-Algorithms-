import java.util.*;
import java.io.*;

public class Pattern_3 {

    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int n = Scn.nextInt();
        // write ur code here

       
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=n-i; j++){
                System.out.print("\t");
            }


            for(int j = 1; j<=i; j++){
                System.out.print("*\t");      
            }

            System.out.println();
            
        }

    }
}