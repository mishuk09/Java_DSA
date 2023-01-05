package ARRAY;

public class insert_last_array {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int n = 8;
        int x = 10;

        System.out.println("Before insert");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr[n] = x;

        for (int i = 0; i < n + 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
