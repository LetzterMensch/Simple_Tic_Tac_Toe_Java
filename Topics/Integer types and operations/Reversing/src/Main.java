import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int tram = a / 100;
        int chuc = (a % 100) / 10;
        int donVi = a % 10;
        a = donVi * 100 + chuc * 10 + tram;
        System.out.println(a);
    }
}