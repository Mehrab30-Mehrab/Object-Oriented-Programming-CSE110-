public class VariableScope{
    static int x=3; // Class Variable is that which is within the class
    public static void main (String [] args){
        int x=1; // Local Variable is that which is inside the method
        System.out.println(x);

    }
    static void doSomething (){
        System.out.println(x);
    }
}