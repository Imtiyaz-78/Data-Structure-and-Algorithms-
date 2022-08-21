import java.util.ArrayDeque;
import java.util.Queue;
import java.util.*;

public class Queue_Intro {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.add(10);
        System.out.println(q.peek());
        System.out.println(q);

        q.add(20);
        System.out.println(q.peek());
        System.out.println(q);

        q.add(30);
        System.out.println(q.peek());
        System.out.println(q);

        q.add(40);
        System.out.println(q.peek());
        System.out.println(q);


        // remove in Queue
        System.out.println(q.remove());
        System.out.println(q);
    }
}

/* --> sumeet 
 import java.util.*;

public class Main {

  public static void main(String[] args) {
    // Write your code here

    Queue<Integer> queue = new ArrayDeque<>();

    queue.add(10); // 10
    queue.add(20); // 10, 20
    queue.add(30); // 10, 20, 30

    System.out.println(queue); // 10, 20, 30
    System.out.println(queue.peek()); // 10 -> 10, 20, 30
    queue.remove(); // 20, 30

    System.out.println(queue); // 20, 30
    System.out.println(queue.peek()); // 20 -> 20, 30
    queue.remove(); // 30

    System.out.println(queue); // 30
    System.out.println(queue.peek()); // 30 -> 30
    queue.remove(); // 

    System.out.println(queue.peek());
  }
}
*/