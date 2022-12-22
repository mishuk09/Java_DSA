package General_code;

public class Fibonacci_num_21_22 {
    public static void main(String args[]) {

        int a = 0, b = 1, fibo, num = 10;

        System.out.print(a + " " + b);

        for (int i = 1; i <= num; i++) {
            fibo = a + b;
            
            a = b;
            b = fibo;

        }
    }

}
 