
import java.io.*;
import java.util.*;

public class Sum_Of_TowArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner( System.in);

    // Taking First Array Input
    int n1  = scn.nextInt();
    int [] one = new int[n1];
    for(int i = 0; i<one.length; i++){
        one[i] = scn.nextInt();
    } 


    // Taking Second Array Input
    int n2  = scn.nextInt();
    int [] two = new int[n2];
    for(int i = 0; i < two.length; i++){
        two[i] = scn.nextInt();
    } 
    


    // Sum Of Array 
    int [] sum = new int[ n2 > n1 ? n2 : n1];

    int i = one.length - 1;
    int j = two.length - 1;
    int k = sum.length - 1;


    int carry = 0;
    while(k >= 0){
        int d = carry;
        if(i >= 0){
            d = d + one[i];
        }

        if(j >= 0){
            d = d + two[j];

        }

        carry = d /10;
        d = d %10;
        sum[k]= d;

        i--;
        j--;
        k--;

    }

        if(carry>0){
            System.out.println(carry);
        }

        for(int x = 0;  x < sum.length; x++){
        System.out.print(" " + sum[x]);
    
       
        }


    }

}

// Sum_Of_Two_Arrays 

/*
1. You are given a number n1, representing the size of array a1.
2. You are given n1 numbers, representing elements of array a1.
3. You are given a number n2, representing the size of array a2.
4. You are given n2 numbers, representing elements of array a2.
5. The two arrays represent digits of two numbers.
6. You are required to add the numbers represented by two arrays and print the arrays.


Constraints
1 
Format
Input
A number n1
n1 number of elements line separated
A number n2
n2 number of elements line separated
Output
A number representing sum of two numbers, represented by two arrays.
Example
Sample Input
5 // Size of Array
3
1
0
7
5
6 // Size Of Array
1
1
1
1
1
1

Sample Output:-
1
4
2
1
8
6
*/

