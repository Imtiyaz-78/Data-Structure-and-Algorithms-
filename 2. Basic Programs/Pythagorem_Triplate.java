import java.util.*;
import java.io.*;

public class Pythagorem_Triplate{
    
  public static void main(String[] args) {
    // write your code here  
    Scanner Scn = new Scanner(System.in);
    int a = Scn.nextInt();
    int b = Scn.nextInt();
    int c = Scn.nextInt();

    if(b>a && b>c){
      int swap = a;
      b = a;
      a = swap;
    }
    
    else if(c>a && c>b ){
      int temp = a;
          a = c;
          c = temp;

    }

    if((a*a) == (b*b)+(c*c)){
      System.out.println("true");
    }
    else{
      System.out.println("false");
    }


   }
  }