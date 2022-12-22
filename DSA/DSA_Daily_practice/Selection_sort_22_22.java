package DSA_Daily_practice;

public class Selection_sort_22_22 {
    // Define function/class
    public static void function(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // main programe
    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 89, 6767, 453453, 432, 3 };
        // outer loop
        for (int i = 1; i < arr.length; i++) {
            int smallEle = i;
            // inner loop
            for (int j = i; j < arr.length; j++) {
                if (arr[smallEle] > arr[j]) {
                    smallEle = j;
                }
            }
            // swap value
            int temp = arr[smallEle];
            arr[smallEle] = arr[i];
            arr[i] = temp;
        }
        function(arr);
    }

}
