import java.util.Scanner;

public class Print_digits {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        Print_Digits(N);
        scn.close();

    }

    static String chk(int N) { // character

        if (N == 0) {
            return "zero";
        } else if (N == 1) {

            return "one";
        } else if (N == 2) {

            return "two";
        } else if (N == 3) {

            return "three";
        } else if (N == 4) {

            return "four";
        } else if (N == 5) {

            return "five";
        } else if (N == 6) {

            return "six";
        } else if (N == 7) {

            return "seven";
        } else if (N == 8) {

            return "eight";
        } else {

            return "nine";
        }

    }

    // Count Of Digits
    static int countDigit(int N) {

        int count = 0;

        while (N != 0) {
            int rem = N % 10;
            count++;
            N = N / 10;
        }

        return count;

    }

    // Print Function
    static void Print_Digits(int N) {

        if (N == 0) { // Case Case
            System.out.print(chk(0));
            return;
        }
        
        /* Method 1
        int digits = countDigit(N); // This is count number 

        int div = (int) Math.pow(10, digits - 1);  // div ^ count - 1 
        */
       
        //div =  div ^ count - 1
        int div = 1;
        for(int i = 1; i <= (countDigit(N)-1); i++){
            div = div * 10;
        }

        while (div != 0) {

            int dig = N / div;

            System.out.print(chk(dig) + " ");

            N = N % div;
            div = div / 10;

        }

    }

}
