package Recursion;

public class factorial_recursion {

    public static void func(int n) {
        if (n == 10) {
            return;
        }
        System.out.println(n);
        func(n + 1);
    }

    public static void main(String args[]) {
        int num = 1;
        func(num);
    }

}
