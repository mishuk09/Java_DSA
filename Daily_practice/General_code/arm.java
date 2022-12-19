public class arm {
    public static void main(String args[]) {
        int num = 121;
        int temp = num;

        int rev = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            rev = (rev * 10) + lastDigit;
            num = num / 10;
        }
        if (temp == rev) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

}
