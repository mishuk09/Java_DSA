public class selection_sort_1 {
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        int arr[] = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        for (int i = 0; i < arr.length; i++) {
            int small = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }

            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        print(arr);

    }

}
