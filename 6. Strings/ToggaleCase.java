// ToggaleCase.java


import java.util.*;
import java.io.*;

public class ToggaleCase{

    // Function for ToggaleCase
    public static String ToggaleCase(String str){
        
        StringBuilder sb = new StringBuilder(str);
        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                char lc = (char)(ch + 'a' - 'A' );
                sb.setCharAt(i, lc);
            }

            else{
                char up = (char)(ch + 'A' - 'a');
                sb.setCharAt(i, up);
            }
        }


        return sb.toString();
    }
      
     
    public static void main( String[] args){
        Scanner scn = new Scanner(System.in);
        String  str = scn.next();
        
        String ans = ToggaleCase(str); // Function ko Call kiye hai 

        System.out.println(ans);


    }
}


/*
Toggle Case
Easy

1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to toggle the case of every character of the given string.

Constraints
1 <= length of string <= 1000

Format
Input
A String

Output
A String

Example
Sample Input

pepCODinG

Sample Output
PEPcodINg

*/
