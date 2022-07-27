
import java.io.*;
import java.util.*;

public class getKPC {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);

    }

    public static String[] codes = { ".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    // 367
    public static ArrayList<String> getKPC(String str) {
        if (str.length() == 0) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        char ch = str.charAt(0); // 3
        String ros = str.substring(1); // 67
        ArrayList<String> rres = getKPC(ros); // all words for 67
        ArrayList<String> mres = new ArrayList<>();

        String code = codes[ch - 48]; // to convert char to integer, always subtract 48
        for (int i = 0; i < code.length(); i++) {
            char chi = code.charAt(i);
            for (String rstr : rres) {
                mres.add(chi + rstr);
            }
        }

        return mres;

    }

}
/*
 import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    public static ArrayList<String> getKPC(String str) { // 196
        if(str.length() == 0){
            ArrayList<String> bwords = new ArrayList<>();
            bwords.add("");
            return bwords;
        }
        
        char ch = str.charAt(0); //'1' => abc
        String ros = str.substring(1); //96
        ArrayList<String> rres = getKPC(ros); // 96 => yp, yq, yr, ys, zp, zq, zr, zs
        ArrayList<String> mres = new ArrayList<>(); // []
        String code = codes[ch - 48]; // codes['1' - 48] = codes[1] = abc
        
        for(int i = 0; i < code.length(); i++){ // abc
            char chcode = code.charAt(i); // a, b, c
            for(String rstr: rres){ // yp, yq, yr, ys, zp, zq, zr, zs
                mres.add(chcode + rstr);
            }
        }
        
        return mres;
    }

}
*/

/*
 * Get Kpc
 * Easy
 * 
 * 1. You are given a string str. The string str will contains numbers only,
 * where each number stands for a key pressed on a mobile phone.
 * 2. The following list is the key to characters map :
 * 0 -> .;
 * 1 -> abc
 * 2 -> def
 * 3 -> ghi
 * 4 -> jkl
 * 5 -> mno
 * 6 -> pqrs
 * 7 -> tu
 * 8 -> vwx
 * 9 -> yz
 * 
 * 3. Complete the body of getKPC function - without changing signature - to get
 * the list of all words that could be produced by the keys in str.
 * Use sample input and output to take idea about output.
 * 
 * Note -> The online judge can't force you to write the function recursively
 * but that is what the spirit of question is. Write recursive and not iterative
 * logic. The purpose of the question is to aid learning recursion and not test
 * you.
 * 
 * Constraints
 * 0 <= str.length <= 10
 * str contains numbers only
 * 
 * Format
 * Input
 * A string str
 * 
 * Output
 * Contents of the arraylist containing words as shown in sample output
 * 
 * Example
 * Sample Input
 * 
 * 78
 * 
 * Sample Output
 * [tv, tw, tx, uv, uw, ux]
 */