public class gcd {
    public static void main(String args[]) {
        int num1 = 25, num2 = 30;
        int gcd = 0;

        for (int i = 1; i < num1 && i < num2; i++) {
            if (num1 % i == 0 && num2 == 0) {
                gcd = i;
            }
        }
        System.out.print(gcd);

    }

}
