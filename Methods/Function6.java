import java.util.Scanner;

public class Function6 {

    public static void printTable(int n) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Multiplication Table of " + n + ":");
        printTable(n);

        scanner.close();
    }
}