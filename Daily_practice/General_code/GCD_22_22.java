
package General_code;

public class GCD_22_22 {
    public static void main(String args[]) {
        int num1 = 25, num2 = 30, gcd = 0;
        // loop for devide num
        for (int i = 1; i < num1 && i < num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
        // print
        System.out.println(gcd);
    }

}
