package ARRAY;

public class Binary_search {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };
        int x = 12;
        int smallEle = 0;
        int largeEle = arr.length - 1;
        int midEle = (smallEle + largeEle) / 2;

        while (smallEle < largeEle) {
            if (arr[midEle] == x) {
                System.out.println("Element founf in" + " " + midEle + " " + "th Index");
                break;
            } else if (arr[midEle] < x) {
                smallEle = midEle + 1;
            } else {
                largeEle = midEle - 1;
            }
            midEle = (smallEle + largeEle) / 2;

        }

        if (smallEle > largeEle) {
            System.out.println("Element not found");
        }
    }

}
