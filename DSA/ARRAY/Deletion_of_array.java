package ARRAY;

public class Deletion_of_array {

    public static void main(String args[]) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 7, 8 };
        int delEle = 2;
        int count = 0;

        System.out.println("Before Delete");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == delEle) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                count = count + 1;
                break;
            }
        }
        System.out.println("After Deletion");

        if (count == 0) {
            System.out.println("Element not found");

        } else {
            System.out.println("Element found and deleted successfully");
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }

            System.out.println();
        }

    }

}
