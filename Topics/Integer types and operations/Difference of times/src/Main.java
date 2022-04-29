import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int hour = 3600;
        final int min = 60;
        int hour1 = scanner.nextInt();
        int min1 = scanner.nextInt();
        int second1 = scanner.nextInt();
        int hour2 = scanner.nextInt();
        int min2 = scanner.nextInt();
        int second2 = scanner.nextInt();
        System.out.println(hour * (hour2 - hour1) + min * (min2 - min1) + (second2 - second1));
    }
}