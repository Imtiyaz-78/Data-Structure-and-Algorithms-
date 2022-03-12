
import java.util.*;

public class RemoveOddNumber{

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();

    list.add(20);
    list.add(15);
    list.add(14);
    list.add(13);
    list.add(8);
    list.add(3);
    list.add(16);
    list.add(19);
    list.add(22);

    for (int i = 0; i < list.size(); i++) {
      int val = list.get(i);
      if (val % 2 == 1) {
        list.remove(i);
      }
    }

    System.out.println(list.size() + " - > " + list);
    // For(int i = 0; i < list.size(); i++){
    //     System.out.println(i);
    // }
  }
}
