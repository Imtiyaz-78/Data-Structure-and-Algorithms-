import java.util.Scanner;


// Find first and last positions of an element in a sorted array
// 1 2 3 4 5 6 7

public class firstandlast {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int target = scn.nextInt();

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println(i);
            }
        }

        int end = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] <= end) {
                System.out.println(i);
            }
        }

    }

}
