
import java.io.*;
import java.util.*;
import java.util.LinkedList;

 public class addLast {

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
                head = node;
                tail = node;
               
            }
            
            else {
                tail.next = node;
                tail = node;
      
            }

            size++;
        }
    }

    public static void testList(LinkedList list) {
        for (Node temp = list.head; temp != null; temp = temp.next) {
            System.out.println(temp.data + " ");
        }
        System.out.println(list.size);

        if (list.size > 0) {
            System.out.println(list.tail.data);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = scn.nextInt();

        for(int i = 0; i < n; i++){
            list.addLast(scn.nextInt());
        }
        
        testList(list);

    }
}