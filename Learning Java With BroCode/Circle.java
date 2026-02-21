import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        // circumference= 2 * Math.PI * radius;
        // area = Math.PI * Math.pow(radius,2);
        // volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);

        Scanner scanner = new Scanner(System.in);

        double area;
        double circumference;
        double radius;
        double volume;


        System.out.println("Enter the radius of the circle : ");
        radius = scanner.nextDouble();

        area = Math.PI * Math.pow(radius, 2);
        circumference = 2 * Math.PI * radius;
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);


       /* System.out.println("The area of the circle is : " + area + "cm^2");
        System.out.println("The circumference of the circle is : " + circumference + "cm");
        System.out.println("The volume of the circle is : " + volume + "cm^3"); */

        System.out.printf("The area of the circle is : %.2fcm^2\n", area);
        System.out.printf("The circumference of the circle is : %.2fcm\n", circumference);
        System.out.printf("The volume of the circle is : %.2fcm^3\n", volume);

        scanner.close();
    }
}