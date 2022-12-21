package General_code;

public class Palindrome_Num_21_22 {

    public static void main(String args[]) {
        int num = 121;
        int rev = 0;
        int temp = num;

        while (temp > 0) {
            int lastDigit = temp % 10;
            rev = (rev * 10) + lastDigit;
            temp = temp / 10;
        }
        if (temp == rev) {
            System.out.println("Palindrome Number");

        } else {
            System.out.println("Not palindrome number");
        }
    }
}
