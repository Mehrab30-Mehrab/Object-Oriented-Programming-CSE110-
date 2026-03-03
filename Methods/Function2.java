import java.util.Scanner;
public class Function2 {
    public static int CalcProduct(int a, int b) {
        int product = a*b;
        return product;
    }

   public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = sc.nextInt();

        int result = CalcProduct(a, b);
        System.out.println("The product of the two numbers is: " + result);
    }
}
