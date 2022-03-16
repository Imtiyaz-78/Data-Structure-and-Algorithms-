

public class Display_Array_InReverse {

  public static void main(String[] args) {
   Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = scn.nextInt();
    }

    displayArrreverse(arr, 0);
    scn.close();


  }

  public static void displayArrreverse(int[] arr, int idx) {
    if (idx == arr.length) {
      return;
    }

    displayArrreverse(arr, idx + 1); // idx + 1 se end tak ka print kardo
    System.out.println(arr[idx]);
  }
}
