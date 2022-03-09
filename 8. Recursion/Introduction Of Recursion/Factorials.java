

import java.io.*;
import java.util.*;

public class Factorials {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int fact = Factorial(n); // Calling Of Function
    System.out.println(fact);
  }

  // This Function is for Factorial
  public static int Factorial(int n) {
    if (n == 0) {
      return 1;
    }

    //Expectation => f(5)= 5 * 4 * 4 * 3 * 2 * 1
    // Faith      => f(4)= 4 * 3 * 2 * 1
    // Ewf        =>  5 * f(4)

    int fnm1 = Factorial(n - 1);
    int fn = n * (fnm1);

    return fn;
  }
}
