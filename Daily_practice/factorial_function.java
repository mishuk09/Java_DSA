import java.security.Principal;
import java.util.*;

public class factorial_function {

    public static void factorial(int n) {

        if (n < 0) {
            System.out.println("Invalid number");
        }

        int fact = 1, i;
        for (i = n; i >= 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
        return;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        factorial(n);
    }

}
