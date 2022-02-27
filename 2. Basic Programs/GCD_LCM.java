import java.util.*;

public class GCD_LCM {

    public static void main(String[] args) {
        // write your code here
        Scanner Scn = new Scanner(System.in);
        int a = Scn.nextInt();
        int b = Scn.nextInt();
        Scn.close();

        int LCM = 1;

        if (a < b) {
        } else {
            int temp = b;
            b = a;
            a = temp;
        }

        // GCD
        // int max = 0;
        for (int i = a; i >= 1; i--) { // or for(int i=1; i <= a; i++) /
            if (a % i == 0 && b % i == 0) {

                /*
                 * if(i > max){
                 * max = i;
                 * }
                 */
                System.out.println(i);
                break;

            }

        }

        // System.out.println(i);

        // LCM
        int j = 1;
        while (j <= Integer.MAX_VALUE) {

            if ((a * j) % b == 0) {
                LCM = a * j;
                System.out.println(LCM);
                break;
            }

            j++;
        }

    }
}
