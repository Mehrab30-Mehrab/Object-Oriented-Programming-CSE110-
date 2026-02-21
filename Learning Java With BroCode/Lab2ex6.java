import java.util.Random;
import java.util.Scanner;
public class Lab2ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int rand = random.nextInt(100)+1;
        int guess;
        for(;;){
            System.out.println("Guess the number : ");
            guess=scanner.nextInt();
            if(guess > rand){
                System.out.println("Too high, try again");
            }
            else if(guess < rand){
                System.out.println("Too low, try again");
            }
            else{
                System.out.println("Congratulations, you guessed the number ");
                break;
            }

        }

    }
}