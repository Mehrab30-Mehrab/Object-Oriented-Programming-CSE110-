public class Overloaded_Method {
    public static String bakePizza(String bread) {
        return bread + " pizza";
    }

    public static void main(String[] args) {
        String pizza = bakePizza("flat bread");
        System.out.println(pizza);
    }
}
