
import java.util.*;
import java.io.*;

public class IsPalindrome {

   public static void main(String args[]) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int r, sum = 0;

      int temp = n;
      while (n > 0) {
         r = n % 10;
         sum = (sum * 10) + r;
         n = n / 10;

      }

      if (temp == sum)
         System.out.println("This Palindrome");
      else
         System.out.println("This is not Palindrome");
   }
}