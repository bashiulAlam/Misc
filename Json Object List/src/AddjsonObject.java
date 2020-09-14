import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;

/**
 * Created by Sabab on 8/22/2017.
 */
public class AddjsonObject {

    public void jsonObjectList() {

        String json = "{\"results\":[{\"lat\":\"value\",\"lon\":\"value\" }, { \"lat\":\"value\", \"lon\":\"value\"}]}";
        Gson gson = new Gson();
        JsonObject inputObj  = gson.fromJson(json, JsonObject.class);
        JsonObject newObject = new JsonObject() ;
        newObject.addProperty("lat", "newValue");
        newObject.addProperty("lon", "newValue");
        inputObj.get("results").getAsJsonArray().add(newObject);
        System.out.println(inputObj);
    }


    public void prepareJson() {
        Gson gson = new Gson();
        JsonObject newObject = new JsonObject() ;
        newObject.addProperty("lat", "newValue");
        newObject.addProperty("lon", "newValue");
        JsonObject inputObj  = gson.fromJson(newObject, JsonObject.class);
        System.out.println(inputObj);

        ArrayList<JsonObject> tempArr = new ArrayList<JsonObject>();
        tempArr.add(inputObj);
        System.out.println("in array list : " + tempArr.get(0));

        JsonArray jsonArguments = new JsonArray();
        jsonArguments.add(newObject);
        System.out.println("in json array : " + jsonArguments.get(0));
    }

    public void addMultipleObjects() {
        Gson gson = new Gson();
        Util util= new Util();
        JsonObject firstObject = new JsonObject();
        JsonObject secondObject = new JsonObject();

        firstObject = util.addProperty(firstObject, "property", "value");
        secondObject = util.addProperty(secondObject, "property", "value");

        //System.out.println(firstObject.toString());
        String temp = firstObject.toString() + "," + secondObject.toString() + ",";
        System.out.println(temp.substring(0, temp.length() - 1));

        //JsonObject newObject = gson.fromJson(temp, JsonObject.class);
        //System.out.println(newObject);
    }
}
