



import java.util.Scanner;

public class Liner_Search {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();

        }

        int target = scn.nextInt();

        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = arr[i];
            }

        }

        if (target == ans) {
            System.out.println();
            System.out.println(ans + " " + "is present in Array");
        }

        else {
            System.out.println();
            System.out.println("No present");
        }

    }

}
