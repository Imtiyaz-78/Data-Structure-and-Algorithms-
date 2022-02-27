import java.util.Scanner;
//import java.util.*;

public class Is_prime_number {
    public static void main(String[] args) {

        Scanner Scn = new Scanner(System.in);
        int t = Scn.nextInt();
        int lv = 1;
       
        while (lv <= t) {
            int n = Scn.nextInt();

            int fac = 2;
            int count = 0;
            while (fac <= (n - 1)) {

                if (n % fac == 0) {
                    count = count + 1;
                  Scn.close();
                }

                fac = fac + 1;
            }
            if (count == 0) {
                System.out.println("Prime ");
            } else {
                System.out.println("Not Prime ");
            }
            lv = lv + 1;
        }
    }
}
