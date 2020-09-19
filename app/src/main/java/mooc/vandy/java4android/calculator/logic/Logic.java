package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.logic.Add;
import mooc.vandy.java4android.calculator.logic.Divide;
import mooc.vandy.java4android.calculator.logic.Multiply;
import mooc.vandy.java4android.calculator.logic.Subtract;
import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {

    //some constants
    public static final int ADD = 1;
    public static final int SUBTRACT = 2;
    public static final int MULTIPLY = 3;
    public static final int DIVIDE = 4;
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;

    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out){
        mOut = out;
    }

    /**
     * Perform the @a operation on @a argumentOne and @a argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        // TODO -- start your code here
        switch (operation) {
            case ADD:
                mOut.print(new Add().calculate(argumentOne, argumentTwo));
                break;
            case SUBTRACT:
                mOut.print(new Subtract().calculate(argumentOne, argumentTwo));
                break;
            case MULTIPLY:
                mOut.print(new Multiply().calculate(argumentOne, argumentTwo));
                break;
            case DIVIDE:
                mOut.print(new Divide().calculate(argumentOne, argumentTwo));
                break;
        }
    }
}
