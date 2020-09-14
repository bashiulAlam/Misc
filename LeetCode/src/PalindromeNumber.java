import static java.lang.Math.ceil;
import static java.lang.Math.log;
import static java.lang.Math.pow;

/**
 * Created by Sabab on 9/9/2020.
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        else if (x < 10)
            return true;
        else {
            int reverse = 0;
            int remainder;
            int num = x;

            while (num != 0) {
                remainder = num % 10;
                reverse = reverse * 10 + remainder;

                num /= 10;
            }

            if (reverse == x)
                return true;
            else return false;
        }
    }

    public int reverse(int x) {
        int reverse = 0;
        int remainder;
        int num = x;
        int prevNum = 0;
        if (x < 0) {
            num *= -1;
        }

        while (num != 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;

            if ((reverse - remainder) / 10 != prevNum)
                return 0;

            prevNum = reverse;
            num /= 10;
        }

        if (x < 0) {
            reverse *= -1;
        }

        return reverse;
    }
}
