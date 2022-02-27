
import java.util.*;

public class Pattern_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        //Write Your Code Here 
       
       
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(j==i || j==n-i-1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }       System.out.println("");
        }
    }
}