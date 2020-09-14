package com.konasl.utils
/**
 * Created by Sabab on 5/6/2016.
 */
import java.util.List;

public class StringUtility {

    public String concat(List<String> strings, String separator)
    {
        StringBuilder sb = new StringBuilder();
        String sep = "";
        for(String s: strings) {
            sb.append(sep).append(s);
            sep = separator;
        }
        return sb.toString();
    }
}
