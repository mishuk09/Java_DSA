package Recursion;

public class print_one_five {

    public static void func(int a) {

        if (a == 50) {
            return;
        }
        System.out.println(a);
        func(a + 1);
    }

    public static void main(String args[]) {

        int num = 1;
        func(num);

    }

}
