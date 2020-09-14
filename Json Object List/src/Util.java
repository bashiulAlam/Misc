import com.google.gson.JsonObject;

/**
 * Created by Sabab on 8/22/2017.
 */
public class Util {

    public JsonObject addProperty(JsonObject jsonObject, String property, String value) {
        jsonObject.addProperty(property, value);

        return jsonObject;
    }
}
