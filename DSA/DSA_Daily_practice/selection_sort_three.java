package DSA.DSA_Daily_practice;

public class selection_sort_three {
    public static void func(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 12, 45, 765, 879, 76, 45, 23, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        for (int i = 0; i < arr.length; i++) {
            int small_ele = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[small_ele] > arr[j]) {
                    small_ele = j;
                }
            }

            int temp = arr[small_ele];
            arr[small_ele] = arr[i];
            arr[i] = temp;

        }
        func(arr);

    }

}
