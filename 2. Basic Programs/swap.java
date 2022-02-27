import java.util.*;

// swapping of two number 
  public class swap {
     public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int n1 = Scn.nextInt();
        int n2 = Scn.nextInt();
        Scn.close();

        n1 = n1 * n2;
        n2 = n1 / n2;
        n1 = n1 / n2;

        System.out.println(n1);
        System.out.println(n2);

        // hh 

    }

}
