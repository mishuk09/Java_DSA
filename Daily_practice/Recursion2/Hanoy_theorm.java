package Recursion2;

public class Hanoy_theorm {

    public static void hanoy(int num, String src, String helper, String desti) {

        if (num == 1) {
            System.out.println("Transfer disc" + num + "from" + src + " to " + desti);
            return;
        }
        hanoy(num - 1, src, desti, helper);
        System.out.println("Transfer disc = " + num + "from" + src + " to " + desti);

        hanoy(num - 1, helper, src, desti);

    }

    public static void main(String args[]) {
        int num = 2;

        hanoy(num, "S", "H", "D");
    }

}