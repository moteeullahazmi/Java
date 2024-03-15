import java.util.Scanner;

public class IfELseDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a age: ");
        var age =in.nextInt();
        if(age>=60){
            System.out.println("You are Citizen");
        }

        else if(age>=18){
            System.out.println("Your age is :"  +age + " You are eligble ");
        }
        else{
            System.out.println("You are not eligible");
        }
    }
}
