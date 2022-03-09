

import java.util.*;
import java.io.*;

public class power_linear{

    public static void main(String[] args){
        Scanner scn = new Scanner (System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int result = power(x , n);
        System.out.println(result);
    }


    public static int power(int x , int n){
        if(n == 0){
            return 1;
        }

        // Expectation => p(2, 5) = 2 * 2 * 2 * 2 * 2
        // faith       => p(2, 4) = 2 * 2 * 2 * 2
        // EWF         => p(2, 5) = p(2, 4) * 2

        int xpnm1 = power(x , n - 1); // xpnm1 = x ka power n minus 1
        int xpn  = xpnm1 * x;   // xpn = x ka power n minus 1 that means

        return xpn; // xpn = x ka power n
    }
}