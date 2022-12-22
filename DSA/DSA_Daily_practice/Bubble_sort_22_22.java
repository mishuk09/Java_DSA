package DSA_Daily_practice;

public class Bubble_sort_22_22 {

    public static void function(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 45, 45, 65, 554, 3, 456345, 5324, 24, 564363, 45 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
        function(arr);
    }

}
