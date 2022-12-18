package General_code;

public class palindrome {
    public static void main(String args[]) {
        int num = 20002;
        int rev = 0;
        int temp = num;
        while (num > num) {
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num / 10;

        }

        if (temp == rev) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not palindrome");
        }
    }

}
