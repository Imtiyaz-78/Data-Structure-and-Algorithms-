
import java.util.*;

public class Display_Of_Array {

  public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }

    displayArr(arr, 0);

    scn.close();
  }

  // Expectation => da(arr, idx) => arr[idx] arr[idx + 1] .. arr[n - 1]
  // Faith => da(arr, idx + 1) => arr[idx + 1] arr[idx + 2] .. arr[n-1]
  // EWF => da(arr, idx) => arr(idx) da(arr, idx + 1)
  public static void displayArr(int[] arr, int idx) {
    if (idx == arr.length) { // This is base Case
      return;
    }

    System.out.println(arr[idx]); // idx means index
    displayArr(arr, idx + 1);
  }
}

/*
 * Display Array
 * Easy
 * 
 * 1. You are given a number n, representing the size of array a.
 * 2. You are given n numbers, representing elements of array a.
 * 3. You are required to print the elements of array from beginning to end each
 * in a separate line.
 * 4. For the above purpose complete the body of displayArr function. Don't
 * change the signature.
 * 
 * Note -> The online judge can't force you to write the function recursively
 * but that is what the spirit of question is. Write recursive and not iterative
 * logic. The purpose of the question is to aid learning recursion and not test
 * you.
 * 
 * Constraints
 * 1 <= n <= 30
 * 0 <= n1, n2, .. n elements <= 10
 * 
 * Format
 * Input
 * A number n
 * n1
 * n2
 * .. n number of elements
 * 
 * Output
 * n1
 * n2
 * .. n elements
 * 
 * Example
 * Sample Input
 * 
 * 5
 * 3
 * 1
 * 0
 * 7
 * 5
 * 
 * Sample Output
 * 3
 * 1
 * 0
 * 7
 * 5
 */
