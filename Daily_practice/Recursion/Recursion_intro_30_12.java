package Recursion;

//print number from 5 to 1

public class Recursion_intro_30_12 {

    public static void function(int num) {

        if (num == 0) {
            return;
        }

        System.out.println(num);
        function(num - 1);
    }

    public static void main(String args[]) {

        int num = 5;

        function(num);

    }

}
