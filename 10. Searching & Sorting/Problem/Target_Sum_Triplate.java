import java.util.*;

public class Target_Sum_Triplate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int target = scn.nextInt();
        int n = scn.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // Sort
        Arrays.sort(arr); // --> nlogn

        for (int i = 0; i < arr.length; i++) { // --> O(n^2)
            int ntar = target - arr[i]; // --> ntr -->new target

            int j = i + 1; // --> left index
            int k = arr.length - 1; // --> right index
            // boolean atleastOneFound = false;

            while (j < k) {
                if (arr[j] + arr[k] > ntar) {
                    k--;
                } else if (arr[j] + arr[k] < ntar) {
                    j++;

                } else {
                    System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);
                    j++; // --> left index
                    k--; // --> right index

                    // atleastOneFound = true;
                }

            }

            // if(atleastOneFound == false){
            // break;
            // }
        }

    }
}

// Total Time Complexcity:- ologn + o(n^2) --> o(n^2)