public class Lab1ex5 {
    public static void main(String[] args) {
        double width = 5.6;
        double height = 8.5;

        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.printf("Area is %.1f * %.1f = %.2f%n", width, height, area);
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f%n", width, height, perimeter);
    }
}
