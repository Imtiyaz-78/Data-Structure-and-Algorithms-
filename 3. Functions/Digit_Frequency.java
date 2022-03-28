
import java.util.*;

public class Digit_Frequency {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int Count_of_freq = getDigitFrequency(n, d);
        System.out.println(Count_of_freq);
        
    }

    // This is Function
    public static int getDigitFrequency(int n, int d) {
        // write code here

        int freq = 0;

        // for extracting didgit
        while (n > 0) {
            int digit = n % 10;
            if (digit == d) {
                freq++;
            }

            n = n / 10;
        }

        return freq;

    }

}

/*
Digit Frequency
Easy

1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.

Constraints
0 <= n <= 10^9
0 <= d <= 9

Format
Input
A number n
A digit d

Output
A number representing frequency of digit d in number n

Example
Sample Input

994543234
 4

Sample Output
3
*/








