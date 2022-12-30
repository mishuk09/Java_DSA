package Recursion;

public class sum_of_natural {

    public static void function(int i, int num, int sum) {

        if (i == num) {
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        function(i + 1, num, sum);

    }

    public static void main(String args[]) {

        int num = 10;
        function(1, 5, 0);
    }

}
