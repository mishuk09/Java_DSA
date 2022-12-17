
///Greatest common divisor....Highest commmon  

package TOP_COMMON_CODE;

public class GCD {

    public static void main(String args[]) {

        int num1 = 25;
        int num2 = 30;
        int gcd = 0;
        for (int i = 1; i < num1 && i < num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }

        }
        System.out.println("First number=" + num1);
        System.out.println("Second number=" + num2);
        System.out.println("GCD Between  num1 and num2=" + gcd);
    }

}
