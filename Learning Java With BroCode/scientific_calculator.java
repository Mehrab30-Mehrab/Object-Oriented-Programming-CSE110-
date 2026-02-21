import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class scientific_calculator {

    static final String RESET = "\u001B[0m";
    static final String BLUE = "\u001B[34m";
    static final String GREEN = "\u001B[32m";
    static final String YELLOW = "\u001B[33m";
    static final String RED = "\u001B[31m";
    static final String CYAN = "\u001B[36m";

    static int operationCount = 0;

    static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    static long factorial(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;
        return f;
    }

    static void showHeader() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy   HH:mm");

        System.out.println(CYAN);
        System.out.println("==============================================");
        System.out.println("        SCIENTIFIC CALCULATOR SYSTEM");
        System.out.println("        Course: CSE103 | Language: Java");
        System.out.println("        Date: " + now.format(df));
        System.out.println("==============================================");
        System.out.println(RESET);
    }

    static void showMenu() {
        System.out.println(YELLOW + "\n------------- OPERATIONS MENU -------------" + RESET);
        System.out.println(" 1. Addition (multiple numbers)");
        System.out.println(" 2. Subtraction (two numbers)");
        System.out.println(" 3. Multiplication (multiple numbers)");
        System.out.println(" 4. Division (two numbers)");
        System.out.println(" 5. Power (x^y)");
        System.out.println(" 6. Square Root");
        System.out.println(" 7. Sine");
        System.out.println(" 8. Cosine");
        System.out.println(" 9. Tangent");
        System.out.println("10. Log base 10");
        System.out.println("11. Natural Log");
        System.out.println("12. Exponential (e^x)");
        System.out.println("13. Factorial");
        System.out.println(" 0. Exit");
        System.out.println("-------------------------------------------");
        System.out.print("Enter your choice: ");
    }

    static void showResultBox() {
        operationCount++;
        System.out.println(GREEN);
        System.out.println("-------------------------------------------");
        System.out.println(" Calculation completed successfully");
        System.out.println(" Operations performed this session: " + operationCount);
        System.out.println("-------------------------------------------");
        System.out.println(RESET);
    }

    static double degToRad(double x) {
        return Math.toRadians(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            clearScreen();
            showHeader();
            showMenu();

            int choice = sc.nextInt();
            double x, y, num, result;
            int count, n;

            switch (choice) {

                case 1:
                    System.out.print("How many numbers do you want to add? ");
                    count = sc.nextInt();
                    result = 0;
                    for (int i = 1; i <= count; i++) {
                        System.out.print("Enter number " + i + ": ");
                        num = sc.nextDouble();
                        result += num;
                    }
                    System.out.printf(GREEN + "Sum = %.4f%n" + RESET, result);
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    x = sc.nextDouble();
                    System.out.print("Enter second number: ");
                    y = sc.nextDouble();
                    System.out.printf(GREEN + "Result = %.4f%n" + RESET, x - y);
                    break;

                case 3:
                    System.out.print("How many numbers do you want to multiply? ");
                    count = sc.nextInt();
                    result = 1;
                    for (int i = 1; i <= count; i++) {
                        System.out.print("Enter number " + i + ": ");
                        num = sc.nextDouble();
                        result *= num;
                    }
                    System.out.printf(GREEN + "Product = %.4f%n" + RESET, result);
                    break;

                case 4:
                    System.out.print("Enter dividend: ");
                    x = sc.nextDouble();
                    System.out.print("Enter divisor: ");
                    y = sc.nextDouble();
                    if (y == 0)
                        System.out.println(RED + "Error: Division by zero" + RESET);
                    else
                        System.out.printf(GREEN + "Result = %.4f%n" + RESET, x / y);
                    break;

                case 5:
                    System.out.print("Enter base: ");
                    x = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    y = sc.nextDouble();
                    System.out.printf(GREEN + "Result = %.4f%n" + RESET, Math.pow(x, y));
                    break;

                case 6:
                    System.out.print("Enter number: ");
                    x = sc.nextDouble();
                    if (x < 0)
                        System.out.println(RED + "Error: Negative input" + RESET);
                    else
                        System.out.printf(GREEN + "Result = %.4f%n" + RESET, Math.sqrt(x));
                    break;

                case 7:
                    System.out.print("Enter angle in degrees: ");
                    x = sc.nextDouble();
                    System.out.printf(GREEN + "Result = %.4f%n" + RESET, Math.sin(degToRad(x)));
                    break;

                case 8:
                    System.out.print("Enter angle in degrees: ");
                    x = sc.nextDouble();
                    System.out.printf(GREEN + "Result = %.4f%n" + RESET, Math.cos(degToRad(x)));
                    break;

                case 9:
                    System.out.print("Enter angle in degrees: ");
                    x = sc.nextDouble();
                    System.out.printf(GREEN + "Result = %.4f%n" + RESET, Math.tan(degToRad(x)));
                    break;

                case 10:
                    System.out.print("Enter number: ");
                    x = sc.nextDouble();
                    if (x <= 0)
                        System.out.println(RED + "Error: Invalid input" + RESET);
                    else
                        System.out.printf(GREEN + "Result = %.4f%n" + RESET, Math.log10(x));
                    break;

                case 11:
                    System.out.print("Enter number: ");
                    x = sc.nextDouble();
                    if (x <= 0)
                        System.out.println(RED + "Error: Invalid input" + RESET);
                    else
                        System.out.printf(GREEN + "Result = %.4f%n" + RESET, Math.log(x));
                    break;

                case 12:
                    System.out.print("Enter exponent: ");
                    x = sc.nextDouble();
                    System.out.printf(GREEN + "Result = %.4f%n" + RESET, Math.exp(x));
                    break;

                case 13:
                    System.out.print("Enter a non-negative integer: ");
                    n = sc.nextInt();
                    if (n < 0)
                        System.out.println(RED + "Error: Invalid input" + RESET);
                    else
                        System.out.println(GREEN + "Result = " + factorial(n) + RESET);
                    break;

                case 0:
                    System.out.println(CYAN + "\nThank you for using the Scientific Calculator" + RESET);
                    System.exit(0);

                default:
                    System.out.println(RED + "Invalid choice. Try again." + RESET);
            }

            showResultBox();
            System.out.println(YELLOW + "\nPress Enter to continue..." + RESET);
            sc.nextLine();
            sc.nextLine();
        }
    }
}
