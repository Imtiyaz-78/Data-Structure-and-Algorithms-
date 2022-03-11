import java.util.Scanner;

public class Hollow {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (
          (i + j) == n / 2 ||
          Math.abs((i - j)) == n / 2 ||
          (i + j) == (3 * (n / 2))
        ) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }

      System.out.println();
      scn.close();
    }
  }
}
