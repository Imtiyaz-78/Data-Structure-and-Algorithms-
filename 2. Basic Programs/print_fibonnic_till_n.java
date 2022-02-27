

import java.util.*;
public class print_fibonnic_till_n {

    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int n = Scn.nextInt();

        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        for (int lv = 1; lv<=(n-2); lv++ ) {

            int c = a+b;
            System.out.println(c);
            a=b;
            b=c;
            Scn.close();
        }
    }
}