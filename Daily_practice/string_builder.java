
import java.util.*;

public class string_builder {
    public static void main(String args[]) {

        StringBuilder name = new StringBuilder("Mahadi");
        System.out.println(name);

        // char at index 0

        System.out.println(name.charAt(3));

        // set character art
        name.setCharAt(0, 'i');
        System.out.println(name);
    }

}
