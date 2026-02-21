import java.util.Scanner;
public class nested_if_ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the regular price of the ticket: ");
        double price = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.print("Are you a senior? (true/false): ");
        boolean isSenior = scanner.nextBoolean();

        if (isStudent) {
            if (isSenior) {
                System.out.println("You get a student discount of 10%");
                System.out.println("You get a senior discount of 20%");
                price = price * 0.7;
            } else {
                System.out.println("You get a student discount of 10%");
                price = price * 0.9;
            }
        } else {
            if (isSenior) {
                System.out.println("You get a senior discount of 20%");
                price = price * 0.8;
            } else {
                System.out.println("You get no discount");
            }
        }

        System.out.printf("Final ticket price: %.2f\n", price);
    }
}
