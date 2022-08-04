
import java.io.*;
import java.util.*;

public class Display_LinkedList {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        // o(1)
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

        public int size() {
            return size;
        }

        // o(n)
        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) { // traverse on node
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {

        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.display();
        System.out.println(list.size());

        // list.display();
        // list.addLast(10);
        // list.display();
        // list.addLast(20);
        // list.display();

    }
}