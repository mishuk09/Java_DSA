public class string_build {

    public static void main(String args[]) {

        StringBuilder name = new StringBuilder("Mahadi");
        System.out.println(name);

        // char at index 0

        System.out.println(name.charAt(3));
        name.setCharAt(2, 'o');
        System.out.println(name);

        // deletion
        name.delete(2, 4);
        System.out.println(name);


        //append


        StringBuilder name2 = new StringBuilder("Mishuk");
        System.out.println(name2.length());
        name2.append("H");
        name2.append("A");
        name2.append("S");
        System.out.println(name2);

    }

}
