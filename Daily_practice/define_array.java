
import java.util.*;

public class define_array {

    public static void main(String args[]) {

        // input number
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Declare array
        int marks[] = new int[num];

        // input array
        for (int i = 0; i < num; i++) {
            marks[i] = sc.nextInt();
        }
        // input searcing number
        int x = sc.nextInt();
        for (int i = 0; i < num; i++) {

            if (marks[i] == x) {
                System.out.print("X found in" + marks[i]);
            } else {
                System.out.println("X not found");
            }
        }
        // for (int i = 0; i < num; i++) {
        //
        //
        // System.out.println(marks[i]);
        //
        // }
    }

}
