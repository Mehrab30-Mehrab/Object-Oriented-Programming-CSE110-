import java.util.Scanner;
public class substring_example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email;
        String username;
        String domain;

        System.out.println("Enter your email : ");
        email = scanner.nextLine();

        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@") + 1);
        System.out.println("Your username is : " + username);

        System.out.println("Your domain is : " + domain);



    }
}