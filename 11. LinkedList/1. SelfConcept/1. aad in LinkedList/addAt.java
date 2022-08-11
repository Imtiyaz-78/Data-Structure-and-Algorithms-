
import java.io.*;
import java.util.*;

public class addAt {
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
                head = tail = temp;
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

        public void addFirst(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = head;
            head = temp;

            if (size == 0) {
                tail = temp;
            }

            size++;
        }

        public void addAt(int idx, int val) {
            // write your code here
            if (idx == 0) {
                addFirst(val);
            } 
            
            else if (idx == size) {
                addLast(val);
            }
             else if (idx < 0 || idx > size) {
                System.out.println("Invalid arguments");
            }
            
            else {
                Node nm1 = head;
                for (int i = 0; i < idx - 1; i++) {
                    nm1 = nm1.next;// nm1 --> n minus 1 yani ek pichhe
                }

                Node np1 = nm1.next; // np1 number of postition
 
                Node node = new Node();
                node.data = val;
                node.next = np1;

                nm1.next = node;
                size++;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            int val = scn.nextInt();
            list.addLast(val);
        }

        int idx = scn.nextInt();
        int value = scn.nextInt();

        list.addAt(idx, value);
        list.display();

    }
}

// -----> Example
// Input:---> size n 
// 5
// 10 20 30 40 50
// index, value(2 35)
// Output ---> 10 20 35 30 40 50 