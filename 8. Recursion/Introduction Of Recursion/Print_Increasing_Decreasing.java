
 
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pdi(n);
    }

    // Expectation => pdi(4) = 4 3 2 1 1 2 3 4
    // Faith => pdi(3) = 3 2 1 1 2 3
    // ewf => pdi(4) = 4 pdi(3) 4
    public static void pdi(int n){
        if(n == 0){
            return;
        }
        
        System.out.println(n); // pre area
        pdi(n - 1); // recursive call
        System.out.println(n); // post area
    }

}