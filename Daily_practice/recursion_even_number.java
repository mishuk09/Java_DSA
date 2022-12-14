public class recursion_even_number {
    // call function

    public static void function(int num) {

        for (int i = 1; i <= num; i += 2) {
            System.out.println(i);
        }

    }

    // main functiuon
    public static void main(String args[]) {

        int num = 20;
        function(num);

    }

}
