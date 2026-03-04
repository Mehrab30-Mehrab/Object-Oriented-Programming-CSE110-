import java.util.Scanner;

public class Function5 {

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        if (isEven(n)) {
            System.out.println(n + " is Even.");
        } else {
            System.out.println(n + " is Odd.");
        }

        scanner.close();
    }
}
