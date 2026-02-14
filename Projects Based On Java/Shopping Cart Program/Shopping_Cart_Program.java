import java.util.Scanner;
public class Shopping_Cart_Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("Enter the item name: ");
        item = scanner.nextLine();

        System.out.print("Enter the item price: ");
        price = scanner.nextDouble();

        System.out.print("Enter the quantity: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou've bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        scanner.close();

    }
}
