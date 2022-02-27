
import java.util.*;

public class Inverse_of_Number {

    public static void main(String[] args) {
        // write your code here
        Scanner Scn = new Scanner(System.in);
        int n = Scn.nextInt();

        int opv = 1; // original place value
        int ofv = 0; // original face value
        int reverse = 0;

        Scn.close();

        while (n != 0) {
            ofv = n % 10; // This is store Remender

            int ipv = ofv; // inverse place value and this is store remender value
            int ifv = opv; // inverse face value and this increses by 1 every time while condition is true

            reverse = reverse + ifv * (int) (Math.pow(10, ipv - 1));

            n = n / 10;
            opv++;
        }

        System.out.println(reverse);

    }
}
