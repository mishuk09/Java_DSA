package TOP_COMMON_CODE;

public class Armstron_Number {
    public static void main(String args[]) {

        int num = 153;
        int arm = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            arm = (lastDigit * lastDigit * lastDigit) + arm;

            num = num / 10;
        }

        if (num == arm) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not armstrong  number");
        }
    }

}
