import java.util.Scanner;

public class Array2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of foods: ");
        int size = input.nextInt();
        input.nextLine();   // clear leftover newline

        String[] foods = new String[size];   // dynamic size

        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter food " + (i + 1) + ": ");
            foods[i] = input.nextLine();
        }

        System.out.println("\nYour foods are:");
        for (String food : foods) {
            System.out.println(food);
        }

        input.close();
    }
}