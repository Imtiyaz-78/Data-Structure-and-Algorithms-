import java.util.*;
public class LCM{
    public static void main(String[] args){
        Scanner Scn = new Scanner(System.in);
        int a = Scn.nextInt();
        int b = Scn.nextInt();

        int n2 = a;
        int n3 = b;
        
        //HCF
        while(a!=0){
            int r = b%a;
            b =a;
            a = r;

        }
        System.out.println(b);

       // LCM By Euclidian Method 
       int lcm = (n2*n3)/b;
       System.out.println(lcm);


    }
}