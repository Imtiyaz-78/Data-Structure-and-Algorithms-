import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int min = i;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }

                int tamp = arr[min];
                arr[min] = arr[j];
                arr[i] = tamp;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
