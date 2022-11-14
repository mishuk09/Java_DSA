
import java.util.*;

public class circle_func {
    public static int circle(int r) {
        int circle = (2 * 3 * r);
        return circle;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        int result = circle(r);
        System.out.println(result);
    }

}
