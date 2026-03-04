import java.util.Scanner;

public class Banking_Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 1000;
        boolean isRunning = true;
        int choice;

        while (isRunning) {

            System.out.println("*****************************");
            System.out.println("Welcome to Banking Program");
            System.out.println("*****************************");
            System.out.println("1. Show Balance");
            System.out.println("2. Add Money/Deposit");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("*****************************");
            System.out.print("Enter your choice (1-4): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("Thank You !! Have A Nice Day !");
        scanner.close();
    }

    static void showBalance(double balance) {
        System.out.println("********************************* ");
        System.out.printf("Current Balance: $%.2f\n", balance);
    }

    static double deposit() {

        System.out.print("Please enter your deposit amount: ");
        double amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }

        return amount;
    }

    static double withdraw(double balance) {

        System.out.print("Please enter your withdraw amount: ");
        double amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return 0;
        }

        return amount;
    }
}
