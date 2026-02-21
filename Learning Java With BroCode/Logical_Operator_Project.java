import java.util.Scanner;
public class Logical_Operator_Project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // username must be between 4-12 characters
        // username must not contain spaces or underscores

        String username;
        System.out.println("Enter your new user name: ");
        username = scanner.nextLine();

        if(username.length() <4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username cannot contain spaces or underscores");
        }
        else{
            System.out.println("Welcome " + username);
        }
        scanner.close();

    }
}
