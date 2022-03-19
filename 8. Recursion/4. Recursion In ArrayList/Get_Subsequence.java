// import java.io.*;
import java.util.*;

public class Get_Subsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> ss = gss(str);
        System.out.println(ss);
        scn.close();

    }
    
      // Expectation => gss(abc) = [..., ..c, .b., .bc] + [a.., a.c, ab., abc]
      // Faith => gss(bc) = [.., .c, b., bc]
      //EWF => gss(abc)= . + gss(bc) + a + gss(bc)
    public static ArrayList<String> gss(String str) {

        if(str.length() == 0){
            ArrayList<String> bres = new ArrayList<>();
            String thebss = "";
            bres.add(thebss); //[""]with size 1, bres.get(0).length == 0
            return bres;
            
        }

        char ch = str.charAt(0); // abc => a
        String ros = str.substring(1); // abc => bc
        ArrayList<String> rres = gss(ros); // gss(bc) => [--, -c, b-, bc]       
        ArrayList<String> mres = new ArrayList<>();

        for(String rstr: rres){
            mres.add(rstr); //[---. --c, -b-, -bc, ]

        }

        for(String rstr: rres){
            mres.add(ch + rstr);//mstr //[---. --c, -b-, -bc, ] +[a--. a-c, ab-, abc, ]

        }

        return mres;


    }

}


/*
Get Subsequence
Easy

1. You are given a string str. 2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str. Use sample input and output to take idea about subsequences. Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.


Constraints
0 <= str.length <= 20


Format
Input
A string str


Output
Contents of the arraylist containing subsequences as shown in sample output


Example
Sample Input

abc

Sample Output
[, c, b, bc, a, ac, ab, abc]
 */
