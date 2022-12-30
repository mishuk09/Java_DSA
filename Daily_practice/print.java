import java.util.*;

class print

{

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int row = 3;
		int col = 4;

		int arr[][] = new int[row][col];
		System.out.println("Input of 2D array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				arr[i][j] = sc.nextInt();

			}

		}

		System.out.println("Output of 2D array");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				System.out.print(arr[i][j] + " ");

			}

			System.out.println();

		}

		int x = 11;

		System.out.println("ELement finding");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				if (arr[i][j] == x) {

					System.out.print("X found  at location(" + i + "," + j + ")");

				}
			}
		}

	}
}