
import java.util.*;

public class threevariable {

    public static int sum(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = sum(a, b, c);
        System.out.println(result);

    }

}
