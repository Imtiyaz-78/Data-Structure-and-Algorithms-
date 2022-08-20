
import java.util.Stack;
import java.util.Queue;
import java.util.*;
import java.io.*;

public class StackIntro {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        stk.push(10);
        System.out.println(stk.peek());
        System.out.println(stk);

        stk.push(20);
        System.out.println(stk.peek());
        System.out.println(stk);

        stk.push(30);
        System.out.println(stk.peek());
        System.out.println(stk);

        stk.push(40);
        System.out.println(stk.peek());
        System.out.println(stk);

        System.out.println(stk.pop());
        System.out.println(stk);

        System.out.println(stk.pop());
        System.out.println(stk);

        System.out.println(stk.pop());
        System.out.println(stk);

        System.out.println(stk.pop());
        System.out.println(stk);

        // ---> ye dono line se stack alreday empty hai and aap pop kar rahe hai then he
        // give error EmptyStackException aayega
        // System.out.println(stk.pop());
        // System.out.println(stk);

    }
}
/*

import java.util.*;

public class Main {

  public static void main(String[] args) {
    // Write your code here

    Stack<Integer> stack = new Stack<>(); // push, pop, peek are all 0(1)
    stack.push(10); // 10
    stack.push(20); // 10, 20
    stack.push(30); // 10, 20, 30
    stack.push(40); // 10, 20, 30, 40

    System.out.println(stack); // 10, 20, 30, 40
    System.out.println(stack.peek()); // 40
    stack.pop(); // 10, 20, 30

    System.out.println(stack.peek()); // 30
    stack.pop(); // 10, 20

    System.out.println(stack.peek()); // 20
    stack.pop(); // 10

    System.out.println(stack.peek()); // 10
    stack.pop(); // 

    System.out.println(stack.peek()); // error
    stack.pop(); // error
  }
}

*/