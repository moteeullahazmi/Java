import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        System.out.print("Enter reverse string:");
        Scanner in = new Scanner(System.in);
        String name= in.nextLine();
        String reverse ="";

        for(int i=name.length()-1; i>=0;i--){
            reverse= reverse+ name.charAt(i);

        }
    System.out.println(reverse);
    }
}
