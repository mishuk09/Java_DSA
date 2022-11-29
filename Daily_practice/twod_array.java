
import java.util.*;

public class twod_array {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colum = sc.nextInt();

        int num[][] = new int[row][colum];

        // input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        // output

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println(num[i][j] + " ");
            }
            System.out.println();
        }

    }

}
