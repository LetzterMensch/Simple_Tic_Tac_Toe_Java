import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int collumns = scanner.nextInt();
        int[][] twoDimArray = new int[rows][collumns];
        int i;
        int j;
        for (i = 0; i < rows; i++)
            for (j = 0; j < collumns; j++) twoDimArray[i][j] = scanner.nextInt();

        for (j = 0; j < collumns; j++) {
            for (i = rows - 1; i >= 0; i--) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}