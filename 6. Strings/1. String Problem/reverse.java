import java.io.*;
import java.util.*;

public class reverse {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        String str = scn.nextLine();
        String nstr = " ";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            nstr = ch + nstr;
        }

        System.out.println(nstr);
    }

}

// -----> In built function of String in StringBuilder Class

import java.io.*;
import java.util.*;

public class reverse {

    public static void main(String[] args) {
        StringBuilder input1 = new StringBuilder();
        String str = scn.nextLine();

        input1.append(str);
        input1.reverse();
        

    }

}





