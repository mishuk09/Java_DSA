package DSA.ARRAY;

public class Selection_sort_array_26_22 {

    // call function
    public static void function(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String args[]) {
        // define array
        int arr[] = { 1, 2, 3, 4, 5, 6, 76, 77, 858, 78, 77656342, 32, 4412 };

        // outer and inner loop for find element
        for (int i = 0; i < arr.length; i++) {
            int smallEle = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallEle] > arr[j]) {
                    smallEle = j;
                }
            }

            // swap value
            int temp = arr[i];
            arr[i] = arr[smallEle];
            arr[smallEle] = temp;
        }
        function(arr);

    }

}
