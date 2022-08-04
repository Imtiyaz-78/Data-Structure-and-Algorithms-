
import java.io.*;
import java.util.*;
import java.util.LinkedList;

 class addLast {

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
                head = tail = node;
            } else {
                tail.next = node;
                tail = node;
            }

            size++;
        }
    }

    public static void testList(LinkedList list) {
        for (Node temp = list.head; temp != null; temp = temp.next) {
            System.out.print(temp.data + " ");
        }
        System.out.println(list.size);

        if (list.size > 0) {
            System.out.println(list.tail.data);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        LinkedList list = new LinkedList();

        for(int i = 0; i < 5; i++){
            list.addLast(scn.nextInt());
        }
        
        // list.addLast(20);
        // list.addLast(30);
        // list.addLast(40);
        testList(list);

    }
}