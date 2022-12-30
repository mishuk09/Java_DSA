package Recursion;

public class Factorial_30_22 {

    public static int factorialcal(int num) {

        if (num == 1) {
            return 1;
        }
        int fact = factorialcal(num - 1);
        int fact1 = num * fact;
        return fact1;
    }

    public static void main(String args[]) {

        int num = 5;
        int result = factorialcal(num);
        System.out.println(result);
    }

}
