public class p {
    public static void main(String args[]) {

        int num = 10;
        boolean isPrime = true;

        for (int i = 2; i <= num - 1; i++) {
            if (num % i == 0) {
                isPrime = false;

            }

        }
        if (isPrime == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }

}
