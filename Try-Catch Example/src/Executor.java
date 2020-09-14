/**
 * Created by Sabab on 5/31/2016.
 */
public class Executor {

    public int divideFunc(int dividend, int divisor) throws IllegalArgumentException {

        if(divisor == 0){
            throw new IllegalArgumentException("Cannot divide by 0");
        }

        return  dividend / divisor;
    }
}
