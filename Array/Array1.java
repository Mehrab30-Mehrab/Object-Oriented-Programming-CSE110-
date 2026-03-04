import  java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] foods = new String[5];
        for (int i = 0; i < foods.length; i++) {
            System.out.println("Enter food " + (i + 1) + ": ");
            foods[i] = input.nextLine();
        }
        for (String food : foods){
            System.out.println(food);
        }
    }
}
