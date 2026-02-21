import java.util.Scanner;
public class Lab2ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }
        System.out.println("bye!");
    }
}