package com.main;

/**
 * Created by Sabab on 4/5/2019.
 */
public class StringParse {

    public static void parseStr() {
        String strToParse = "[\n" +
                "  \"57138793-4b57-e911-812a-005056ab3791\"\n" +
                "]";

        strToParse = strToParse.replaceAll("\\[", "").replaceAll("\\]","");
        strToParse = strToParse.trim();
        strToParse = strToParse.replaceAll("^\"|\"$", "");
        //strToParse = strToParse.substring(1, strToParse.length());

        System.out.println(strToParse);
    }

}
