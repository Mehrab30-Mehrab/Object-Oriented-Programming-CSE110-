import java.util.Scanner;
public class Calculator_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean ValidOpeation = true;

        System.out.println("Enter number 1 :");
        num1 = scanner.nextDouble();

        System.out.println("Enter an operator (+,-,*,/,^) : ");
        operator = scanner.next().charAt(0);

        System.out.println("Enter number 2 :");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Can't divide by 0!");
                    ValidOpeation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid Operator!");
                ValidOpeation = false;
            }
        }
        if (ValidOpeation) {
            System.out.printf("The result is : %.2f",result);
        }
        scanner.close();
    }
}
