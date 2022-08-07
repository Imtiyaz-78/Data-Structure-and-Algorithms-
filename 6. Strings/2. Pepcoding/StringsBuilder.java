

import java.io.*;
import java.util.*;

public class StringsBuilder {

  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("hello");

    char ch = sb.charAt(0);
    System.out.println(ch);


    // Function Of String Builder to Manipulate with String

    sb.setCharAt(0, 'b'); // change The postion and added new character ex- hello then output bello (h is remove)
    System.out.println(sb);

    sb.deleteCharAt(0); // remove or Delete the Charracter in String
    System.out.println(sb);

    sb.insert(0, 't'); // Add new haracter on zero position
    System.out.println(sb);
  }
}
