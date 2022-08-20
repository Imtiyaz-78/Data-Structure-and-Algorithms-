import java.util.Scanner;

import Ad_Last.LinkedList;

public class sortLinkedList {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int n = scn.nextInt();
        for(int i = 0; i < n; i++){
            int val = scn.nextInt();
            list.addLast(val);
            
        }
        
    }
}
