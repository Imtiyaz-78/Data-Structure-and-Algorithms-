
// Normal Static with Array 
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Normal_Stack {

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
            for (int i = 0; i < arr.length; i++) {
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
        CustomStack st = new CustomStack(n);

        for(int i = 0; i < n; i++){
             st.push(scn.nextInt());
        }

        st.display();

        int val = st.pop();
        val = st.pop();
        val = st.pop();
        val = st.pop();
        System.out.println(val);
      
    }
}