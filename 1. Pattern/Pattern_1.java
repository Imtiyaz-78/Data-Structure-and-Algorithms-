import java.util.*;
import  java.io.*;

public class Pattern_1 {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int n = Scn.nextInt();


        for(int i = 1; i<= n; i++){
            for (int j = 1; j<= i; j++){
                System.out.print("*"+"\t");
            }

            System.out.println();
        }
    }
}
