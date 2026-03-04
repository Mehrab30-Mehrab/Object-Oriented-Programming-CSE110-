public class Overloaded_Method_2 {
    public static String bakepizza(String bread){
        return bread + " pizza";
    }
    public static String bakepizza(String bread, String cheese) {
        return cheese + "  " + bread + " pizza";
    }
    public static String bakepizza(String bread, String cheese, String bacon){
        return bacon + " " + cheese + " " + bread + " pizza";
    }
    public static void main (String [] args){
        String pizza = bakepizza ("Flat bread","Mozzarella","Beef Bacon");
        System.out.println(pizza);
    }
}
