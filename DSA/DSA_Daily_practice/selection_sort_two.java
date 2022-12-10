package DSA.DSA_Daily_practice;

public class selection_sort_two {
    public static void func(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 8, 7, 6, 5, 5, 9, 4, 3, 2, 1 };

        for (int i = 0; i < arr.length; i++) {
            int first_ele = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (first_ele > arr[j]) {
                    first_ele = j;
                }

            }
            int temp = arr[first_ele];
            arr[first_ele] = arr[i];
            arr[i] = temp;
        }
        func(arr);
    }

}
