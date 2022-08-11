
import java.io.*;
import java.util.*;

public class getAt {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        // o1
        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        // o1
        public int size() {
            return size;
        }

        // on
        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        // on
        public int getAt(int idx) {
            if (size == 0) {
                System.out.println("List is empty");

            }

            else if (idx < 0 || idx >= size) {
                System.out.println("Invalid arguments");

            }

            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            } 
            return temp.data;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        LinkedList list = new LinkedList();
       
        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            list.addLast(scn.nextInt());
        }

        int idx = scn.nextInt();

        int value = list.getAt(idx);
        if (value != -1) {   // Handle for Negative Test case
            System.out.println(value);
        }
    }
}