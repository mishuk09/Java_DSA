
//Prime number
public class pr {

    public static void main(String args[]) {

        int num = 7;
        boolean isPrime = true;

        for (int i = 2; i < num - 1; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;

            }
        }
        if (isPrime == true) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime");
        }

    }

}
