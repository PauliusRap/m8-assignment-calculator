package mooc.vandy.java4android.calculator.logic;

/**
 * Perform the Divide operation.
 */
public class Divide{
    // TODO -- start your code here
    public String calculate(int value1, int value2) {
        if (value2 == 0) {
            return "Division by 0!";
        }
        int result = value1 / value2;
        int remainder = value1 % value2;
        return result +" R: " + remainder;
    }
}
