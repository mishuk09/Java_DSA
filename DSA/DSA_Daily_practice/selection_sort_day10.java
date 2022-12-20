package DSA.DSA_Daily_practice;

public class selection_sort_day10 {

    public static void function(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 876, 456, 32, 434, 23545, 756, 432, 21, 1 };
        // Selection sort so as theory part

        for (int i = 0; i < arr.length; i++) {
            int smallValue = i;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[smallValue] > arr[j]) {

                    smallValue = j;

                }
            }

            int temp = arr[smallValue];
            arr[smallValue] = arr[i];
            arr[i] = temp;
        }
        function(arr);
    }

}
