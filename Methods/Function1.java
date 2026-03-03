import java.util.Scanner;
public class Function1 {
    public static int CalculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int a = input.nextInt();
        System.out.println("Enter the 2nd number: ");
        int b = input.nextInt();
        int sum = CalculateSum(a, b);


        System.out.println("The sum is: " + sum);

    }
}
