
// Find Highest Character Frequenecy of String ex. aaaabbbbbcccccccccc output c max times aaya hai 
import java.io.*;
import java.util.*;

public class Highest_character_Frequency {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        int[] farr = new int[26]; // 0 pr a ki freq, 1 pr b ki freq..

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int idx = ch - 'a';
            farr[idx]++;
        }

        int maxidx = 0;
        for (int i = 1; i < farr.length; i++) {
            if (farr[i] > farr[maxidx]) {
                maxidx = i;
            }
        }

        char mfc = (char) (maxidx + 'a'); // mfc = maximum frequency Character
        System.out.println(mfc);

        // Time Complexity:- o(n)

    }
}


/*
 sample input
 aaabbbbcccccccd

 output:
 c (Max times aaya hai c )

*/