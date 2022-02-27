
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
         while(n>0){
             int digit = n%10;
             if(digit==d){
                 freq++;
             }

             n = n/10;
         }

         return freq;

    }

}