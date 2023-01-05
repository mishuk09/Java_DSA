package ARRAY;

public class insert_to_array {

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int x = 9;

        for (int i = arr.length - 1; i > arr.length - 1; i--) {
            arr[i - 1] = x;
        }
        
        System.out.println("After insert");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

}
