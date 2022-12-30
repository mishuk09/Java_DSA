package Recursion;

public class Recursion_1 {

    public static void function(int num) {

        if (num == 100) {
            return;
        }
        System.out.println(num);

        function(num + 1);
    }

    public static void main(String args[]) {
        int num = 1;
        function(num);
    }

}
