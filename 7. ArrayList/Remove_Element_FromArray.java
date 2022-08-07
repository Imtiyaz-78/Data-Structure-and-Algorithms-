
import java.util.ArrayList;
import java.util.Scanner;


public class Remove_Element_FromArray {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    int n = scn.nextInt();
    for (int i = 0; i < n; i++) {
      int v = scn.nextInt();
      list.add(v);
    }

    // System.out.println(list);
    for(int i = 0; i < list.size(); i++){
        System.out.println(i);
    }

    System.out.println(list.toString().replace("[","").replace("]",""));

    int idx = scn.nextInt();
    list.remove(idx);
    // System.out.println(list);
    System.out.println(list.toString().replace("[","").replace("]",""));
    System.out.println(list.toString().replace("[", "").replace("]",""));

    
  }
}
