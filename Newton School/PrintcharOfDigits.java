import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class PrintcharOfDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

    }

    static String chk(int n) {

        if (n == 0) {
            return "zero";
        } else if (n == 1) {
            return "one";

        } else if (n == 3) {
            return "three";
        } else if (n == 4) {
            return "four";
        } else if (n == 5) {
            return "five";
        } else if (n == 6) {
            return "six";
        } else if (n == 7) {
            return "seven";
        } else if (n == 8) {
            return "eight";
        } else {
            return "nine";
        }

    }

    // Count of Digits

    static int countOfDigits(int n) {
        int count = 0;
        while (n != 0) {
            int rem = n % 10;
            count++;
            n = n / 10;

        }
        return count;

    }
    
    // Print digits
    
}
