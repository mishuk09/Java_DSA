package DSA;

public class insertion_sor {
    public static void function(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 435, 6756,54634, 32, 34, 43, 5, 46, 4342 };

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && current < arr[j]) {

                arr[j + 1] = arr[j];
                j--;

            }
            arr[j + 1] = current;

        }
        function(arr);

    }

}
