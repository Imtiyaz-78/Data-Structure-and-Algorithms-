
import java.io.*;
import java.util.*;

public class ckeck_LinkedList_palindrome {
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


        public boolean IsPalindromeHelper(Node right) {
            if (right == null) {
                return true;
            }

            boolean rres = IsPalindromeHelper(right.next);
            if (rres == false) {
                return false;
            }
             else if (pleft.data != right.data) {
                return false;
            }
             else {
                pleft = pleft.next;
                return true;
            }
        }

        Node pleft;

        public boolean IsPalindrome() {
            pleft = head;
            return IsPalindromeHelper(head);
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

        System.out.println(list.IsPalindrome());
    }
}
