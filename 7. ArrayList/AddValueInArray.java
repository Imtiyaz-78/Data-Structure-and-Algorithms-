import java.io.*;
import java.util.*;

public class AddValueInArray {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>(); // ise empty sqare array ban jata hai ye dynamic array

    int n = scan.nextInt();
    for (int i = 0; i < n; i++) {
      int v = scan.nextInt();
      list.add(v);
    }

    System.out.println(list);

    int idx = scan.nextInt();
    int val = scan.nextInt();
    // list.remove(idx); // for remove arne ke liye function
    list.add(idx, val);
    System.out.println(list);

    scan.close();
  }
}
