
import java.util.*;
import java.io.*;
import java.lang.String;

public class MaxWordOfString{

    public static void main(String[] args){
       Scanner scn = new Scanner(System.in);
       String s = scn.nextLine();
       fun(s);
    }

    private static void fun(String s){
        String[] strs = s.split(" ");
        String ans = "";
        for(String str:strs){
            if(str.length()>ans.length()){
                ans = str;
            }
        }
        System.out.println(ans);
    }
}