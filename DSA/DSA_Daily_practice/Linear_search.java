package DSA.DSA_Daily_practice;

public class Linear_search {

    // Time complexsity of Linear search is O(n)

    public static void main(String args[]) {

        // define array

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 65, 7, 56, 54, 78, 53 };
        int x = 78;

        // loop for read array
        for (int i = 0; i < arr.length; i++) {

            // check x in array or not
            if (x == arr[i]) {
                System.out.println("X found in " + i + " ");
            }
        }
    }

}
