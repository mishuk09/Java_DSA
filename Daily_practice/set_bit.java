public class set_bit {
    public static void main(String args[]) {

        int num = 5;
        int pos = 1;

        int bitmask = 1 << pos;

        int newnumber = bitmask | num;
        System.out.println(newnumber);

    }

}
