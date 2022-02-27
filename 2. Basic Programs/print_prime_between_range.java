
import java.util.*;
// prime number between a  range suppose 15 and 200;
public class print_prime_between_range {
    public static void main(String[] args) {

        Scanner Scn = new Scanner (System.in);
        int low = Scn.nextInt();
        int high = Scn.nextInt();

        for (int n = low; n<=high;  n++ ){

            int count = 0;

            for(int div = 2; div*div<=n; div++){
                if(n%div == 0){
                    count++;
                    break;
                }
            }

            if(count == 0){
                System.out.println(n);
            }

        }
    }
}

