

// 3rd Largest and third lagestProduct
public class thirdlargest {
    public static void thirdLargest(int arr[],int n) {
            
        /*
         * There should be
         * atleast three elements
         */
        if (n < 3) {
            System.out.printf("Invalid Input");
            return;
        }

        // Find first
        // largest element
        int first = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > first)
                first = arr[i];

        // Find second
        // largest element
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
            if (arr[i] > second &&  arr[i] < first)
                   second = arr[i];

        // Find third
        // largest element
        int third = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++)
            if (arr[i] > third && arr[i] < second)
                    
                third = arr[i];

          System.out.println(first * second * third); // Triplate Product of third max
     
        
   
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = { 12, 13, 1,  10, 34, 16 };
              
        int n = arr.length;
        thirdLargest(arr, n);
    }
}

// This code is contributed
// by Smitha
