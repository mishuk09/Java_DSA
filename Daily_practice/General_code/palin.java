public class palin {
    public static void main(String args[]) {
        int num = 153;
        int rev = 0;

        int temp = num;
        while (num > 0) {
            int lastDigit = num % 10;
            rev = (lastDigit * lastDigit * lastDigit) + rev;
            num = num / 10;
        }

        if (temp == rev) {
            System.out.println("Atmstrong");
        } else {
            System.out.println("Not arms");
        }
    }

}
