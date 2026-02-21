import java.util.Scanner;

public class Lab1ex2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of side 1 : ");
        int a = scanner.nextInt();
        System.out.println("Enter the value of side 2 : ");
        int b = scanner.nextInt();
        System.out.println("Enter the value of side 3 : ");
        int c = scanner.nextInt();

        if (a == b && b == c && c == a) {
            System.out.println("Your triangle is an Equilateral Triangle");
        } else if (a == b || b == c || c == a) {
            System.out.println("Your triangle is an Isosceles Triangle");
        } else {
            System.out.println("Your triangle is a Scalene Triangle");
        }


    }
}