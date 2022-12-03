import java.util.*;

public class sum_of_odd_func {
    public static int sum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i += 2) {
            sum = sum + i;

        }
        return sum;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int result = sum(num);
        System.out.println(result);
    }
}
