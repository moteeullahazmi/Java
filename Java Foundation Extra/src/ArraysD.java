import java.util.Scanner;
public class ArraysD {
    public static void main(String[] args) {
        int[][] marks = new int[3][3];
        Scanner in= new Scanner(System.in);

        for(int i=0; i<=marks.length-1;i++){
            for (int j=0; j<marks[i].length;j++){
                System.out.println(+i+ "Enter a " +j+ "the value is");
                int data=in.nextInt();
            }
        }





    }
}
