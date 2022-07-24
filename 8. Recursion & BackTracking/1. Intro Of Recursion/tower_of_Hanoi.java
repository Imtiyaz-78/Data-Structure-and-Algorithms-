
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class tower_of_Hanoi {
    static int c = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n, 'A', 'B', 'C');
    }

    public static void solve(int n, char A, char B, char C) {
        if (n == 1) {
            System.out.println(n + ":" + A + "->" + C);
            return;
        }
        solve(n - 1, A, C, B);
        System.out.println(n + ":" + A + "->" + C);
        solve(n - 1, B, A, C);
    }
}


