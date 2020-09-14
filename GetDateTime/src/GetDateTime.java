/**
 * Created by Sabab on 1/11/2018.
 */

import java.util.*;
import java.text.*;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class GetDateTime {

    public static void main(String args[]) {
        Date localDate = new Date();
        DateFormat converter = new SimpleDateFormat("MMdd");
        System.out.println(converter.format(localDate));

        Date localTime = new Date();
        DateFormat timeConverter = new SimpleDateFormat("HHmmSS");
        System.out.println(timeConverter.format(localTime));

        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmSS");
        String time= sdf.format(cal.getTime());
        System.out.println(time);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd HHmmss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        Date yearMonthDate = new Date();
        DateFormat yearMonthConverter = new SimpleDateFormat("yyMM");
        String currentDate = yearMonthConverter.format(yearMonthDate);
        String currentYear = currentDate.substring(0, 2);
        String currentMonth = currentDate.substring(2, currentDate.length());
        System.out.println(currentYear + " " + currentMonth);
        int futureYear = Integer.parseInt(currentYear) + 1;
        String futureDate = futureYear + currentMonth;
        System.out.println(futureDate);

        DateFormat dateFormat = new SimpleDateFormat("MMdd");
        DateFormat timeFormat = new SimpleDateFormat("HHmmss");
        System.out.println(dateFormat.format(cal.getTime()) + " " + timeFormat.format(cal.getTime()));

        SimpleDateFormat datePattern = new SimpleDateFormat("yyyyMMdd");
        long currTime = System.currentTimeMillis();
        String currentYMD = datePattern.format(new Date(currTime));
        System.out.println("currentYMD : " + currentYMD);
    }
}
