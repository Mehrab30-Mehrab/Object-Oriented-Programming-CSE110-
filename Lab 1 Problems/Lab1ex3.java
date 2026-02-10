import java.util.Scanner;

public class Lab1ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find out it's respective factorial : ");
        int n= scanner.nextInt();
        int factorial=1;
        for (int i=1;i<=n;i++){
            factorial = factorial*i;
        }
        System.out.println("The factorial of " + n + " will be : " + factorial);
        scanner.close();

        }
    }