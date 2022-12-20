package General_code;

public class fibona {

    public static void main(String args[]) {
        int a = 0, b = 1, c, num = 10;
        System.out.println(a + " " + b);

        for (int i = 1; i <= num; i++) {
            c = a + b;

            a = b;
            b = c;
        }

    }

}
