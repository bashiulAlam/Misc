/**
 * Created by Sabab on 5/31/2016.
 */
public class Main {

    public static void main(String args[]) {
        int num1, num2;
        Executor ex = new Executor();
        try {
            // Try block to handle code that may cause exception
            num1 = 0;
            num2 = 62;
            int div = ex.divideFunc(num2, num1);
            System.out.println("Res: " + div);
        } catch (IllegalArgumentException e) {
            // This block is to catch divide-by-zero error
            System.out.println(/*"Error: Can't divide a number by zero:: " +*/ e.getMessage());
            int div = ex.divideFunc(25, 5);
            System.out.println("Res: " + div);
        }
        System.out.println("I'm out of try-catch block in Java.");
    }
}
