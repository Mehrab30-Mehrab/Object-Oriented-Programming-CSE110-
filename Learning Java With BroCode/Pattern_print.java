import java.util.Scanner;

public class Pattern_print {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(text.charAt(j) + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

