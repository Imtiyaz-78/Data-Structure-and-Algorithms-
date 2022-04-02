// import java.util.Scanner;
import java.util.*;
import java.io.*;;

public class even {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        For_Loop(n);
        scn.close();
        
    }

    public static void For_Loop(int n){
        //Enter your code here
           for(int i = 1; i <=n; i++){
               if(i % 2 == 0){
                  System.out.print("even" + " ");

               }
               else{
                    System.out.print("odd" +" ");
               }
           }
        }
    
}

/*
public static void For_Loop(int n){
//Enter your code here
   for(int i = 1; i <=n; i++){
       if(i % 2 == 0){
          System.out.print("even" + " ");

       }
       else{
            System.out.print("odd" +" ");
       }
   }
}


*/
