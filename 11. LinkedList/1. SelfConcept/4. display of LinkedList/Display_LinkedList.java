
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

        void addLast(int val) {
            Node node = new Node();
            node.data = val;
            node.next = null;

            if (size == 0) {
                // head = tail = node;
                tail = node;
                head = node;
            }
            
            else {
                tail.next = node;
                tail = node;
                 
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
        Scanner scn = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = scn.nextInt();

        for (int i = 0; i < n; i++) {
            list.addLast(scn.nextInt());
        }

        list.display();

    }
}