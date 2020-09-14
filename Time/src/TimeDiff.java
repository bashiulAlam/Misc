/**
 * Created by Sabab on 9/20/2016.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

public class TimeDiff {
    public static void main(String[] args) {
        String startTime = "09:20 AM";
        String endTime = "06:40 PM";

        System.out.println(Hour24Formate(startTime));
        System.out.println(Hour24Formate(endTime));

        startTime = Hour24Formate(startTime);
        endTime = Hour24Formate(endTime);

        SimpleDateFormat format = new SimpleDateFormat("HH:mm");

        Date date1 = null;
        try {
            date1 = format.parse(startTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Date date2 = null;
        try {
            date2 = format.parse(endTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date1.getTime() + " " + date2.getTime());

        long differenceMinute = (date2.getTime() - date1.getTime()) / (1000 * 60);
        long hour = differenceMinute / 60;
        long minute = differenceMinute % 60;

        System.out.println("differenceMinute " + differenceMinute);
        System.out.println("hour " + hour);
        System.out.println("minute " + minute);
    }

    public static String Hour24Formate(String string) {
        if (string.contains("PM")) {
            string.replace(" PM", "");
            int hour = Integer.parseInt(string.substring(0, 2));
            hour += 12;
            return hour+string.substring(2,5);
        } else if (string.contains("AM")) {
            return string.replace(" AM", "");
        }
        return null;
    }
}
