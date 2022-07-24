import java.io.*;
import java.util.*;

public class MergeSort {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int arr[] = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }

    arr = MergeSort(arr, 0, arr.length - 1);
    for(int i = 0; i < arr.length; i++) {
      int val = arr[i];
      System.out.println(val);
    }

  }

  public static int[] MergeSort(int arr[], int start, int end) {

    if (start == end) {
      int[] ba = new int[1];
      ba[0] = arr[start];
      return ba;
    }

    int mid = ((start + end) / 2);

    int[] fsh = MergeSort(arr, start, mid);
    int[] ssh = MergeSort(arr, mid + 1, end);
    int[] fsa = mergetwosortedarrays(fsh, ssh);

    return fsa;

  }

  public static int[] mergetwosortedarrays(int[] a, int[] b) {

    int[] ans = new int[a.length + b.length];

    int i = 0;
    int j = 0;
    int k = 0;
    while (i < a.length && j < b.length) {
      if (a[i] <= b[j]) {
        ans[k] = a[i];
        i++;
        k++;
      } else {
        ans[k] = b[j];
        j++;
        k++;
      }
    }

    if (i == a.length) {
      while (j < b.length) {
        ans[k] = b[j];
        j++;
        k++;
      }
    } 
    
    else if (j == b.length) {
      while (i < a.length) {
        ans[k] = a[i];
        i++;
        k++;
      }
    }

    return ans;
  }
}


