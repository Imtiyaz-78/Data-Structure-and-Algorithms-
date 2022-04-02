
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class dataType {
    public static void main(String[] args) {
        // Your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        System.out.println(n1);
        long num = scn.nextLong();
        System.out.println(num);
        float f = scn.nextFloat();
        System.out.println(f);
        double d = scn.nextDouble();
        System.out.println(d);
        char c = scn.next().charAt(0);
        System.out.println(c);
        scn.close();

    }
}
