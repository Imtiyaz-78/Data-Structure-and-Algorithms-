import java.util.*;
import java.io.*;
import java.util.LinkedList;

public class MergeTwo_Sorted_LinedList {
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

        public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
            LinkedList ml = new LinkedList();

            Node one = l1.head;
            Node two = l2.head;

            while (one != null && two != null) {
                if (one.data < two.data) {
                    ml.addLast(one.data);
                    one = one.next;
                } 

                else {
                    ml.addLast(two.data);
                    two = two.next;
                }
            }

            while (one != null) {
                ml.addLast(one.data);
                one = one.next;
            }

            while (two != null) {
                ml.addLast(two.data);
                two = two.next;
            }

            return ml;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        LinkedList list1 = new LinkedList();

        int n1 = scn.nextInt();

        for (int i = 0; i < n1; i++) {
            int val = scn.nextInt();
            list1.addLast(val);
        }

        int n2 = scn.nextInt();
        LinkedList list2 = new LinkedList();
       
        for (int i = 0; i < n2; i++) {
           int val = scn.nextInt();
           list2.addLast(val);
        }

        LinkedList merged = LinkedList.mergeTwoSortedLists(list1, list2);
        merged.display();
        list1.display();
        list2.display();
    }
}
