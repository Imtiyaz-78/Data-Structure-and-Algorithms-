
import java.io.*;
import java.util.*;
import java.util.LinkedList;

public class addFirst {
    public static class Node {
        int data;
        Node next;
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

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
            Node node = new Node();
            node.data = val;

            if (size == 0) {
                head = node;
                tail = node;
            }
            
            else {
                node.next = head;
                head = node;
            }

            size++;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int n = scn.nextInt();
       
    //    list.addFirst(10);
    //    list.addFirst(30);
    //    list.addFirst(5);
    //    list.display();

    for(int i = 0; i < n; i++){ // By user 
       list.addFirst(scn.nextInt());
    }

    list.display();
        
    }
}