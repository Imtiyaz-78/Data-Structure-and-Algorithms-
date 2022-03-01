import java.util.*;

public class GCD_by_Euclidin_Method{
    public static void main(String[] args){
     //write your cour code here 
     Scanner Scn = new Scanner(System.in);
     int a = Scn.nextInt();
     int b = Scn.nextInt();
     
      //GCD_by_Euclidin_Method

     //HCF By Euclidin method 
     while(a != 0){
         int r = b%a;
         b = a;
         a = r;
     }
     
     System.out.println(b);

    }
}
