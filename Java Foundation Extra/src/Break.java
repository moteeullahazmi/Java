import java.util.Scanner;
public class Break {
    public static void main(String[] args) {
        int[] arr= {101,23,42,10};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number you are searching");
        int target = in.nextInt();
        boolean found = false;
        for(int i=0;i <arr.length;i++) {
            if (target == arr[i]) {
                System.out.println("Found the number");
                break;
            }
        }
        if(!found){
            System.out.println("Not found");
        }

    }
}
