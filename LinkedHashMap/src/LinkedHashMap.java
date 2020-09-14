import java.util.LinkedHashMap;
import java.util.Map;

import org.json.JSONObject;

public class LinkedHashMap {
    public static void main(String[] args) {
        Map<String,String > myLinkedHashMap =  new LinkedHashMap<String, String>();
        myLinkedHashMap.put("1","first");
        myLinkedHashMap.put("2","second");
        myLinkedHashMap.put("3","third");

        JSONObject json = new JSONObject(myLinkedHashMap);
        System.out.println(json.toString());
    }
}