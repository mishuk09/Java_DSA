package ARRAY;

public class Insert_to_unsorted_array {

    public static void main(String args[]) {

        int arr[] = { 12, 16, 20, 40, 50, 70 };
        int x = 26;
        int position = 3;

        System.out.println("Before insert");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = arr.length - 1; i > position - 1; i--) {

            arr[i] = arr[i - 1];
        }
        arr[position - 1] = x;
        System.out.println("After insert");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
