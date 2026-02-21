import java.util.Scanner;
public class Right_angle {
    // hypotenuse finding
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.println("Enter the side1: ");
        a = scanner.nextDouble();

        System.out.println("Enter the side2: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.print("The hypotenuse is : " +c);


    }
}