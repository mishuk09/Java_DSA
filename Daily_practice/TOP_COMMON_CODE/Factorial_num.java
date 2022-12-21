package TOP_COMMON_CODE;

public class Factorial_num {
    public static void main(String args[]) {

        int num = 5;
        int fact = 1;

        for (int i = 1; i < num+1; i++) {

            fact = fact * i;

        }

        System.out.print(fact);
    }

}
