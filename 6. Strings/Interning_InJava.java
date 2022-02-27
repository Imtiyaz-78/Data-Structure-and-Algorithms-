

import java.util.*;
import java.io.*;

public class Interning_InJava{
    public static void main(String[] args){
        // write your code here 

        String s1 = "hello";
        String s2 = "hello"; // Interning
        String s3 =  new String("hello"); // Interning
        String s4 = s1; // Refrence Copy 

        // == (Double equals) just check on stack and not the content
        // equalas first check the stack (if equals return true, otherwise checks the content)


        System.out.println(s1==s2);
        System.out.println(s1==s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));


    }
}
