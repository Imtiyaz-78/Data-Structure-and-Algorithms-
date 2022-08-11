import java.util.*;
import java.io.*;
import java.util.LinkedList;

public class removeFirst {

    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = temp;
                tail = temp;
            } 
            
            else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public int size() {
            return size;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");
            }
            System.out.println();
        }

        public void removeFirst() {
            if (size == 0) {
                System.out.println("List is empty");
            }

            else if (size == 1) {
                head = null;
                tail = null;
                size = 0;
            }

            else {
                head = head.next;
                size--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            int val = scn.nextInt();
            list.addLast(val);
        }

        list.removeFirst();
        list.display();

    }
}
