import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(timeConversion("04:59:59AM"));
        System.out.println(timeConversion("12:00:00AM"));


        System.out.println(otp());

        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        System.out.println(pickingNumbers(a));
    }

    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        String time = s.substring(8);
        int hour = Integer.parseInt(s.substring(0, 2));
        //System.out.println("time : " + time + " hour : " + hour);
        if (time.equals("AM") && hour == 12)
            hour = 0;
        else if (time.equals("PM") && hour != 12)
            hour += 12;

        String mHour = "";
        if (hour < 10)
            mHour = "0" + hour;
        else mHour += hour;

        return mHour + s.substring(2, 8);
    }

    static String otp() {
        //String s = "DKYC re-submission request.\nUsername: Megh Balika\nOTP: 709686\nExpire date: 11/07/2019 05:07:58 PM\"\nUID: HpEB4rwGsrF";
        String s = "DKYC re-submission request.\n" +
                "Username: 01869757856\n" +
                "OTP: 993739\n" +
                "Expire date: 11/07/2019 06:07:36 PM";

        char[] c = s.toCharArray();
        int counter = 0;
        int index = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ':')
                counter++;

            if (counter == 2) {
                index = i;
                break;
            }
        }

        String substr = s.substring(index + 2, index + 8);

        return substr;
    }

    public static int pickingNumbers(List<Integer> a) {
        // Write your code here
        int max = 0;
        Collections.sort(a);
        int flag = 0;
        for (int i = 0; i < a.size() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < a.size(); j++) {
                if (Math.abs(a.get(i) - a.get(j)) > 1) {
                    index = j;
                    System.out.println("abs block for : " + a.get(i) + " index " + index);
                    flag = 1;
                    break;
                }
            }
            int counter = index - i;
            if (counter > max)
                max = counter;
        }

        if (flag == 0)
            return a.size();
        else return max;
    }
}
