import java.util.Scanner;
public class Function3 {
    public static int CalculateFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find it's factorial :");
        int n = scanner.nextInt();
        int result = CalculateFactorial(n);
        System.out.println("The factorial of " + n + " is " + result);
    }







}
