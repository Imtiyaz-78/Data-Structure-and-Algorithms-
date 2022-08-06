
import java.io.*;
import java.util.*;

public class getLast {
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

        // o1
        public int getLast() {
            if (size == 0) {
                System.out.println("List is empty");

            }

            return tail.data;
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            list.addLast(scn.nextInt());
        }

        int result = list.getLast();
        System.out.println(" Last Elemt in LinkedList " + " " + result);

    }
}