
public class recurtion_print {

    // recursion part
    public static void func(int num) {
        if (num == 100) {
            return;
        }
        System.out.println(num);
        func(num + 1);
    }

    // main function
    public static void main(String args[]) {
        int num = 1;
        func(num);

    }

}