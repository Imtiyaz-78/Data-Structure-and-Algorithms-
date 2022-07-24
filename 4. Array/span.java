
import java.io.*;
import java.util.*;

public class span {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }

        }

        int Difference = max - min;
        System.out.println(Difference);

    }
}

// 6 // Size Of Array
// 15
// 30
// 40
// 4
// 11

// span means = Difference between max and min that mans. ( Difference = max -
// min )
// output 40 - 4 = 36