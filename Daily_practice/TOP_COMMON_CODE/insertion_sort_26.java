package TOP_COMMON_CODE;

import java.util.Currency;

public class insertion_sort_26 {

    // define function
    public static void function(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 8, 6, 5, 4, 34, 34, 32, 23, 23, 4, 3, 3, 2, 1 };
        // outer lopp for read array
        for (int i = 1; i < arr.length; i++) {
            int smallEle = arr[i];
            int j = i - 1;
            // check condition
            while (j >= 0 && smallEle < arr[j]) {
                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = smallEle;
        }

        function(arr);
    }

}

// Time complexcity of insertion sort O(N^2)