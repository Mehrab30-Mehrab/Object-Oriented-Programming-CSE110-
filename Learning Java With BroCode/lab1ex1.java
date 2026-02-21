import java.util.Scanner;

public class lab1ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your respective marks : ");
        int marks = scanner.nextInt();
        if (marks < 0) {
            System.out.println("Invalid Marks");
        } else if (0 <= marks && marks < 25) {
            System.out.println("Your grade is : F");
        } else if (marks >= 25 && marks < 45) {
            System.out.println("Your grade is : E");
        } else if (marks >= 45 && marks < 50) {
            System.out.println("Your grade is : D");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Your grade is : C");
        } else if (marks >= 60 && marks < 80) {
            System.out.println("Your grade is : B");
        } else {
            System.out.println("Your grade is : A");
        }
    }
}