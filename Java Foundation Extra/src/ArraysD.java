import java.util.Scanner;
public class ArraysD {
    public static void main(String[] args) {
        int[][] marks = new int[3][3];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j <= marks[i].length - 1; j++) {
                System.out.println("enter " + i + " Enter a " + j + " the value is");
                marks[i][j] = in.nextInt();
            }
        }
        System.out.println("the element are: ");
        for (int i = 0; i <= marks.length - 1; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] );
            }
            System.out.println(",");
        }
    }
}


