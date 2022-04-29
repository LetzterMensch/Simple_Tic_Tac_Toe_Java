import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int duration = scanner.nextInt();
        int foodCost = scanner.nextInt();
        int flightTickets = scanner.nextInt();
        int hotelCost = scanner.nextInt();
        int totalSum = duration * foodCost + (duration - 1)*hotelCost + flightTickets*2;
        System.out.println(totalSum);
    }
}