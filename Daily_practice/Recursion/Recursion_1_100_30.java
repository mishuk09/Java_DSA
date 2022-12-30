package Recursion;

public class Recursion_1_100_30_22 {

    public static void function(int num) {
        if (num == 0) {
            return;
        }

        System.out.println(num);
        function(+1);
    }

    public static void main(String args) {
        int num = 1;

        function(num);
    }

}
