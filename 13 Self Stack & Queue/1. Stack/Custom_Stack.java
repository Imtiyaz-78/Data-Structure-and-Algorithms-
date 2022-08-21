
// Normal Static with Array 
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Custom_Stack {

    public static class CustomStack {
        int[] arr;
        int top;

        public CustomStack(int cap) {
            arr = new int[cap];
            top = -1;
        }

        int size() {
            // Time ->O(1)
            return top + 1;

        }

        void display() {
            // Time ->O(N)
            for (int i = arr.length -1; i >=0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        void push(int val) {
            // write ur code here
            if (top == arr.length - 1) { // or size() == arr.length
                // Stack Overflow
                System.out.println("Stack overflow");
                return;
            }

            top++;
            arr[top] = val;
        }

        int pop() {
            // Time --> O(1)
            if (top == -1) { // size() == 0
                System.out.println("Stack underflow");
                return -1;
            }

            int val = arr[top];
            top--;
            return val;

        }

        int top() { // top means ek pointer size ke liye
            // Time --> O(1)
            // under flow
            if (top == -1) {
                System.out.println("Stack underflow");
                return -1;
            }
            int val = arr[top];
            return val;

        }

    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        CustomStack stack = new CustomStack(n);
        // Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            stack.push(scn.nextInt());
        }

         stack.display();
         System.out.println(stack.top());
        
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());
        // System.out.println(stack.pop());

    
      
    }
}