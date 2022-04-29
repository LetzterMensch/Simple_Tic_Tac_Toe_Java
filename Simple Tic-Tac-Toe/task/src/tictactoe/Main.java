package tictactoe;

import java.util.Scanner;
import java.lang.Math;

public class Main {
    private static char who;

    /*
        return value :
        1. There is a winner.
        2. Draw or game not finished
        3. Impossible
     */
    static int win(String line) {
        int countWinners = 0;
        //Impossible_ X/O has 2 or more moves than the other.
        int[] characters = {0, 0};
        for (int i = 0; i < 9; i++) {
            if (line.charAt(i) == 'X') characters[0]++;
            if (line.charAt(i) == 'O') characters[1]++;
        }
        if (Math.abs(characters[0] - characters[1]) >= 2) return 3;
        //Horizontal
        for (int i = 0; i < 6; i += 3) {
            if ((line.charAt(i) != '_') && (line.charAt(i) == line.charAt(i + 1)) && (line.charAt(i + 1) == line.charAt(i + 2))) {
                who = line.charAt(i);
                countWinners++;
            }
        }
        if (countWinners == 1) return 1;
        //Vertical
        for (int i = 0; i < 3; i++) {
            if ((line.charAt(i) != '_') && (line.charAt(i) == line.charAt(i + 3)) && (line.charAt(i + 3) == line.charAt(i + 6))) {
                who = line.charAt(i);
                countWinners++;
            }
        }
        if (countWinners == 1) return 1;

        //Diagonal--Finite cases.
        //Forward Diagonal
        if ((line.charAt(0) != '_') && (line.charAt(0) == line.charAt(4)) && (line.charAt(4) == line.charAt(8))) {
            who = line.charAt(0);
            return 1;
        }
        //Backward Diagonal
        if ((line.charAt(2) != '_') && (line.charAt(2) == line.charAt(4)) && (line.charAt(4) == line.charAt(6))) {
            who = line.charAt(2);
            return 1;
        }
        //Impossible_ If there are 2 winners.
        if (countWinners == 2) {
            System.out.println("Impossible");
            return 3;
        }
        //Draw or Game not finished
        return 2;
    }

    static void display(String line) {
        int count = 0;
        System.out.println("---------");
        System.out.print("| ");
        do {
            if (line.charAt(count) == '_') System.out.print(" ");
            else System.out.print(line.charAt(count));
            System.out.print(' ');
            count++;
            if ((count % 3) == 0) {
                System.out.println("|");
                if (count != line.length()) System.out.print("| ");
            }
        } while (count != line.length());
        System.out.println("---------");
    }

    public static String changeCharInPosition(int position, char ch, String str) {
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Print the game grid.
        String line = "_________";
        display(line);
        // Read coordinates.
        int x, y;
        boolean turn = true;
        while (true) {
            System.out.println("Enter the coordinates : ");
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (Character.isDigit(x) || Character.isDigit(y)) {
                System.out.println("You should enter numbers!");
                continue;
            }
            if (x > 3 || y > 3 || x < 0 || y < 0) {
                System.out.println("Coordinates should be from 1 to 3!");
                continue;
            }
            if (line.charAt(3 * (x - 1) + y - 1) == 'X' || line.charAt(3 * (x - 1) + y - 1) == 'O') {
                System.out.println("This cell is occupied! Choose another one!");
                continue;
            }
            if (turn) {
                line = changeCharInPosition(3 * (x - 1) + y - 1, 'X', line);
                turn = false;
            } else {
                line = changeCharInPosition(3 * (x - 1) + y - 1, 'O', line);
                turn = true;
            }
            display(line);

            if ((win(line) == 2) && line.contains("_")) {//Game not finished
                continue;
            } else if ((win(line) == 1)) {
                System.out.println(who + " wins");//Print the winner
            } else if ((win(line) == 2) && !line.contains("_")) {//Draw
                System.out.println("Draw");
            } else if ((win(line) == 3))
                System.out.println("Impossible");

            break;
        }

    }
}