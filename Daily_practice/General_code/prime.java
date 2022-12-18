package General_code;

public class prime {
    public static void main(String args[]) {
        int num = 5;
        boolean isPrime = true;

        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("Number is prime");

        } else {
            System.out.println("Number is not prime");
        }
    }

}
