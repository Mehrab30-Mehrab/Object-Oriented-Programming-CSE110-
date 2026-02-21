import java.util.Scanner;
        public class ArmstrongNumber {
            static void main() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the number : ");
                int number = scanner.nextInt();
                int originalNumber= number;
                int digits=0;
                int sum=0;
                for (int temp = number; temp>0 ; temp= temp/10){
                    switch (digits++) {
                    }
                }
                for (int temp = number; temp>0 ; temp = temp/10){
                    int digit = temp % 10 ;
                    sum+=Math.pow(digit, digits);
                }
                if (sum==originalNumber){
                    System.out.println(originalNumber + " is an  Armstrong Number");
                }
                else{
                    System.out.println(originalNumber + " is not an Armstrong Number");
                }
                scanner.close();
            }
}
