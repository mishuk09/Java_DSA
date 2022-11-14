
import java.util.*;

public class eligble_vote {
    public static void vote(int age){
        if (  age >=18){
            System.out.println("You are eligble for vote");
        }
        else{
            System.out.println("You are not eligble for vote");
        }
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        vote(age);
    }
    
}
