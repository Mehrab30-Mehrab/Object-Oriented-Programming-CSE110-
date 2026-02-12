import java.util.Scanner;
public class Compound_Interest_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;
        System.out.print("Enter principal amount : ");
        principal = scanner.nextDouble();
        System.out.print("Enter interest rate (in %) : ");
        rate = scanner.nextDouble()/100;
        System.out.print("Enter the # of years : ");
        years = scanner.nextInt();
        System.out.print("Enter the # of times compounded per year : ");
        timesCompounded = scanner.nextInt();

        amount = principal * Math.pow(1 + rate/timesCompounded, timesCompounded*years);
        System.out.printf("The amount after %d years is $%.2f\n", years, amount);

        scanner.close();
    }
}
