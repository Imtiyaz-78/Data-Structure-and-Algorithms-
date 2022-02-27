
import java.util.*;

public class print_till_n_which_not_divide_by_3 {
    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);

        int n = Scn.nextInt();
        for(int i =1; i<=n; i++){
            if(i%3 !=0){
                System.out.println(i);

            }
        }
    }

}