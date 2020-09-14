package com.konasl;

import com.konasl.util.RandomGenerator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) throws ParseException {

        RandomGenerator randomGenerator = new RandomGenerator();
        for (int i = 0; i < 50; i++) {
            List<Integer> gameNumbers = randomGenerator.gameNumbers(1, 45);

            for (int j = 0; j < gameNumbers.size(); j++)
                System.out.print(gameNumbers.get(j) + " ");
            System.out.println();
        }

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(dateFormat.format(new Date()));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC-ZONE-0"));

        String inputString = "00:01:30.500";

        Date date = sdf.parse("1970-01-01 " + inputString);
//        System.out.println("in milliseconds: " + date.getTime());
        System.out.println(sdf.format(new Date()));

        String str = "1122334455";
        System.out.println(str.substring(8, 10));
    }
}
