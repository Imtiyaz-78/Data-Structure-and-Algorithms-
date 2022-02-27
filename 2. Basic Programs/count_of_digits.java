import java.util.*;

public class count_of_digits {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int n = Scn.nextInt();
        int temp = n;

        int count = 0;
        while (temp!= 0) {
            int rem = n % 10;  // remender calculate karne ki koee need nahi hai
            temp = temp / 10;
            count = count + 1;
        }

        // div = div^Count_of_digit-1
        int div = 1;
        for(int i = 1; i<=(count-1); i++){
            div = div*10;
        }

        // Final Loop
        while(div!=0){
            int front = n/div;
            n = n%div;
            System.out.println(front);
            div = div/10;
        }

    }
}
