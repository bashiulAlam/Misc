/**
 * Created by Sabab on 9/9/2020.
 */
public class AToI {
    public int myAtoi(String str) {
        if (!str.isEmpty())
            str = str.replaceAll("\\s+", "");
        String newStr = "";
        int num;

        if (str.isEmpty())
            return 0;
        else if (Character.isLetter(str.charAt(0)) || str.charAt(0) == '.')
            return 0;
        else if (str.length() == 1 && (str.charAt(0) == '+' || str.charAt(0) == '-'))
            return 0;
        else if (str.contains("+") && str.contains("-"))
            return 0;
        else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '.' || Character.isLetter(str.charAt(i)))
                    break;

                if (!Character.isLetter(str.charAt(i)))
                    newStr += str.charAt(i);
            }

            try {
                num = Integer.parseInt(newStr);
            } catch (NumberFormatException e) {
                if (str.charAt(0) == '-')
                    return -2147483648;
                else return 2147483647;
            }

            return num;
        }
    }
}
