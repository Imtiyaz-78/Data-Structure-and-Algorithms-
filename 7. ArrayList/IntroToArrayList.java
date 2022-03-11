 
 import java.util.*;
 import java.io.*;

 public class IntroToArrayList{
     public static void main(String[] args){
         ArrayList <Integer> list; // Declare of ArrayList 
         list = new ArrayList<>(); // Define of ArrayList 

        //  ArrayList <Integer> list = new ArrayList<>();  //in oneline you can Declare
         
         // 1 Size Function
         System.out.println(list.size()+ " -> "  + list); // Size 0 []

         // 2. Add the value in Array function 
         list.add(10);
         list.add(20);
         list.add(30);
       
         System.out.println(list.size()+ " -> "  + list); // 3 -> [10, 20, 30]


         // 3. set(idx, value) function
         list.set(1,200);
         System.out.println(list.size()+ " -> "  + list); // 3 -> [10, 200, 30]


         // 4. add(indx, value) Function
         list.add(1, 2000); // Is function se Array ki Size Automatic Increse Ho jati hai
         System.out.println(list.size()+ " -> "  + list); // 4 -> [10,2000, 200, 30]


        // 5. get(indx) Function
        int val = list.get(1); // this get the value from ArrayList
        System.out.println(val); // 2000
        System.out.println(list.size()+ " -> "  + list); // 4 -> [10, 2000, 200, 30]
        System.out.println();


        // 6. Remove(idx) Function idx = index number of ArrayList
        list.remove(1);
        System.out.println(list.size()+ " -> "  + list); // 3 -> [10, 2000, 200,30] 2000 will remove
         System.out.println();

        // Lopps in ArrayList
        System.out.println("--------- Loop in ArrayList ----------");
        for(int i = 0; i < list.size(); i++){
            int val1 = list.get(i);
            System.out.println(val1);
        }

        // Lopp ia Array List 2nd Method
        System.out.println("--------- Loop in ArrayList 2nd Method ----------");
        for(int val2 : list){
            System.out.println(val2);
        }














     }
 }  