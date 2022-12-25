package DSA.ARRAY;

import java.util.*;

public class Linear_search_Array {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // input section
        int row = sc.nextInt();
        int col = sc.nextInt();

        // define array
        int arr[][] = new int[row][col];

        // taking input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // define element for search

        int x = sc.nextInt();

        // loop for output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (x == arr[i][j]) {
                    System.out.println("X find in(" + i + "," + j + ")");
                }

            }

        }
    }

}
