public class recurtion_even {

    public static void result(int num) {
        if (num == 10) {
            return;
        }
        System.out.println(num);
        result(num + 1);
    }

    // main part
    public static void main(String args[]) {

        int num = 1;

        result(num);

    }

}
