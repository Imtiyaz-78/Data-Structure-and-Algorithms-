
import java.io.*;
import java.util.*;

public class reverse_LinkedList_Data_Iterative {

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
                head = node;
                tail = node;
            }

            else {
                tail.next = node;
                tail = node;
            }

            size++;
        }

        public void display() {
            for (Node temp = head; temp != null; temp = temp.next) {
                System.out.print(temp.data + " ");

            }
            System.out.println();

        }

        public Node getNodeAt(int idx) {
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp;
        }

        public void reverseDI() {
            // write your code here
            int li = 0;
            int ri = size - 1;
            while (li < ri) {
                Node left = getNodeAt(li);
                Node right = getNodeAt(ri);

                int temp = left.data;
                left.data = right.data;
                right.data = temp;

                li++;
                ri--;
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

        list.reverseDI();
        list.display();

    }
}

/*
 Reverse A Linked List (data Iterative)
Easy

1. You are given a partially written LinkedList class.
2. Here is a list of existing functions:
    2.1 addLast - adds a new element with given value to the end of Linked List
    2.2. display - Prints the elements of linked list from front to end in a single line. 
    All elements are separated by space
    2.3. size - Returns the number of elements in the linked list.
    2.4. removeFirst - Removes the first element from Linked List. 
    2.5. getFirst - Returns the data of first element. 
    2.6. getLast - Returns the data of last element. 
    2.7. getAt - Returns the data of element available at the index passed. 
    2.8. addFirst - adds a new element with given value in front of linked list.
    2.9. addAt - adds a new element at a given index.
    2.10. removeLast - removes the last element of linked list.
    2.11. removeAt - remove an element at a given index.
3. You are required to complete the body of reverseDI function. The function should be an iterative function and should reverse the contents of linked list by changing the "data" property of nodes.
4. Input and Output is managed for you.

Constraints
None

Format
Input
Input is managed for you

Output
Output is managed for you

Example
Sample Input

addFirst 10
addFirst 20
addLast 30
addLast 40
addLast 50
addFirst 60
removeAt 2
display
reverseDI
display
quit

Sample Output
60 20 30 40 50 
50 40 30 20 60
*/