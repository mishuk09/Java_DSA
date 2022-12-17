//palindrome number

public class pal {
    public static void main(String args[]) {

        int num = 153;
        int rev = 0;

        int temp = num;
        while (num > 0) {
            int lastDegit = num % 10;
            rev = (lastDegit * lastDegit * lastDegit) + rev;
            num = num / 10;
        }
        System.out.println(rev);
        if (temp == rev) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

}
