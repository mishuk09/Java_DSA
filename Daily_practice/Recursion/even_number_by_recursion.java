package Recursion;

public class even_number_by_recursion {

    public static void func(int n) {
        if (n == 100) {
            return;
        }
        System.out.println(n);
        func(n = n + 2);
    }

    public static void main(String args[]) {

        int num = 2;

        func(num);

    }

}
