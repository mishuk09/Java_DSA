
import java.util.*;

public class avg_func {
    public static int avg(int num1,int  num2 , int num3 ){
        int avg =(num1+num2+num3)/3;
        return avg;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int result =avg(num1, num2, num3);
        System.out.println(result);

    }

}
