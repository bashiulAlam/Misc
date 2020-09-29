/**
 * Created by Sabab on 9/9/2020.
 */
public class AToI {
    public int myAtoi(String str) {
        if (!str.isEmpty())
            str = str.trim();
        String newStr = "";
        int num = 0;
        boolean negative = false;

        if (str.isEmpty())
            return 0;
        else if (Character.isAlphabetic(str.charAt(0)) || str.charAt(0) == '.')
            return 0;
        else if (str.length() == 1 && (str.charAt(0) == '+' || str.charAt(0) == '-'))
            return 0;
        else if (str.contains("+") && str.contains("-") && Math.abs(str.indexOf('+') - str.indexOf('-')) == 1)
            return 0;
        else {
            int i = 0;
            if (str.charAt(0) == '-') {
                negative = true;
                i++;
            } else if (str.charAt(0) == '+') i++;

            while (i < str.length()) {
                if (str.charAt(i) == '.' || !Character.isDigit(str.charAt(i)) || str.charAt(i) ==  ' ')
                    break;

                if (Character.isDigit(str.charAt(i)))
                    newStr += str.charAt(i);

                //System.out.println("str : " + newStr);
                i++;
            }

            try {
                num = Integer.parseInt(newStr);
            } catch (NumberFormatException e) {
                if (negative) {
                    if (Character.isDigit(str.charAt(1)))
                        return -2147483648;
                    else return 0;
                }
                else {
                    if (Character.isDigit(str.charAt(1)))
                        return 2147483647;
                    else return 0;
                }
            }

            if (negative)
                num *= -1;
            return num;
        }
    }
}
