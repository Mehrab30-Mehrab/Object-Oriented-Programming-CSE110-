public class Lab1ex7 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int number = 2; count < 100; number++) {
            boolean prime = true;

            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                sum += number;
                count++;
            }
        }

        System.out.println("Sum of the first 100 prime numbers: " + sum);
    }
}
