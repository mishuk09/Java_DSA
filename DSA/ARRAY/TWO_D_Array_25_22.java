package DSA.ARRAY;

import java.util.*;

public class TWO_D_Array_25_22 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Declare row col value
        int row = sc.nextInt();
        int col = sc.nextInt();
        // define array
        int arr[][] = new int[row][col];
        // outer loop for take input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        // loop for output
        System.out.println("Output");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
