
import java.util.*;
public class string_new {

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();

        for(int i=0;i<name.length()/2;i++){
            int font=i;
            int back=name.length() - 1 - i;

            char fontChar=name.charAt(font);
            char backChar=name.charAt(back);

            name.setCharAt(font, backChar);
            name.setCharAt(back, fontChar);


        }
        System.out.println(name);


    }
    
}
