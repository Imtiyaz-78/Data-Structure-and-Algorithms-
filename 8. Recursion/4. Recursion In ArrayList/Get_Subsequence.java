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