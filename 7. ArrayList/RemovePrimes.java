// 9319277275
// somtechie22@gmail.com

import java.io.*;
import java.util.*;

public class RemovePrimes {

  public static boolean IsPrime(int num) {
    boolean isPrime = true;

    for (int div = 2; div * div <= num; div++) {
      if (num % div == 0) {
        isPrime = false;
        break;
      }
    }

    return isPrime;
  }

  public static void solution(ArrayList<Integer> al) {
    // write your code here
    for (int i = al.size() - 1; i >= 0; i--) {
      int val = al.get(i); // iss mein ulta loop isliye lagaya gya hai num remove karne ke baad index change ho jata hai
      boolean isThisValPrime = IsPrime(val);
      if (isThisValPrime == true) {
        al.remove(i);
      }
    }
  }

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    ArrayList<Integer> al = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      al.add(scn.nextInt());
    }

    String result = solution(al);
    System.out.println(result); 
  }
}










/*
Remove Primes
Easy

1. You are given an ArrayList of positive integers. 2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList. Note -> The order of elements should remain same.


Constraints
1 <= N <= 10000


Format
Input
A number N arr1 arr2.. N numbers


Output
An Arraylist


Example
Sample Input

4
3 12 13 15

Sample Output
[12, 15]
*/
