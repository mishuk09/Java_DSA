package ARRAY;

public class Delete_from_last_array {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println("Before Delete");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("After Delete");

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
