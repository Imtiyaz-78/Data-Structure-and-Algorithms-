import java.util.*;

public class digits_of_number{

    public static void main(String[] args) {
        // write your code here

        Scanner Scn = new Scanner (System.in);
        int n = Scn.nextInt();
        int temp = n;

        // Count of digits
        int Count = 0;
        while(temp!=0){
            //int rem = temp%10;
            temp= temp/10;
            Count = Count+1;
            Scn.close();

        }

        //div = div ^ countof digits-1
        int div = 1;
        for(int i =1; i<=(Count-1); i++){
            div = div*10;
        }

        // Final Loops
        while(div!=0){
            int front = n/div;
            n = n%div;
            System.out.println(front);
            div = div/10;
        }


    }
}