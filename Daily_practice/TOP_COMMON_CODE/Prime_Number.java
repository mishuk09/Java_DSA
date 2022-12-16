package TOP_COMMON_CODE;

public class Prime_Number {

    public static void main(String args[]) {

        int num = 5;
        boolean isPrime = true;

        if (num == 2) {
            System.out.println("2 Is prime nummber");
        } else {
            for (int i = 2; i < Math.sqrt(num) - 1; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }

            }
            if (isPrime == true) {
                System.out.println("Number is prime number");
            } else {
                System.out.println("Not prime number");
            }
        }
    }
}
