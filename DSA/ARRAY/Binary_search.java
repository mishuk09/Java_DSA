package ARRAY;

import java.util.*;

public class Binary_search {



    //Time complexcity if Binary search is O(log n)

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // array initial
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 };

        //user input
        System.out.print("Enter element:");
        int x = sc.nextInt();
        int smallEle = 0;
        int largeEle = arr.length - 1;
        int midEle = (smallEle + largeEle) / 2;

        // while loop for define limit
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
        // if element not found then return message
        if (smallEle > largeEle) {
            System.out.println("Element not found");
        }
    }

}
