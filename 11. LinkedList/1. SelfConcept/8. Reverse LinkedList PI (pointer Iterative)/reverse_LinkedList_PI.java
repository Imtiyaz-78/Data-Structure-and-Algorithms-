
import java.util.LinkedList;
import java.io.*;
import java.util.*;

public class reverse{
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
            } else {
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

      
        public void reversePI() {
           
            Node prev = null;
            Node curr = head;

            while (curr != null) {
                Node next = curr.next;

                curr.next = prev; 

                prev = curr;
                curr = next;
            }

            Node temp = head;
            head = tail;
            tail = temp;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int n = scn.nextInt();
        for(int i = 0; i < n; i++){
          int val = scn.nextInt();
          list.addLast(val);
        }
           
       list.reversePI();
       list.display();
          
    }
}
