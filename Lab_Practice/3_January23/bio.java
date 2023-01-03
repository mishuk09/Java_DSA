import java.util.Scanner;

class index{
    public static void main (String args[]){


        Scanner sc=new Scanner(null)
 
        int marks=65;

        if(marks>=90){
            System.out.println("A+");
        }
        else if(marks>=75 && marks<=90){
            System.out.println("A");
        }
        else if(marks>=65 && marks<=75){
            System.out.println("B+");
        }
        else if(marks>= 55 && marks <= 65){
            System.out.println("B");
        }
        else if(marks>= 45 && marks <= 55){
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }
        
    }
}