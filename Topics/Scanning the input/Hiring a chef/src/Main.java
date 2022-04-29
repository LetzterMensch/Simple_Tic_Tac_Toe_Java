import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String yearsOfExp = scanner.next();
        String cuisine = scanner.next();
        System.out.printf("The form for %s", name);
        System.out.printf(" is completed. We will contact you if we need a chef who cooks %s", cuisine);
        System.out.printf(" dishes and has %s", yearsOfExp);
        System.out.print(" years of experience.");
    }
}