/**
 * Created by Sabab on 10/31/2017.
 */
import com.sun.deploy.net.HttpResponse;
import jdk.nashorn.internal.parser.JSONParser;
import sun.net.www.http.HttpClient;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.Gson;

import javax.net.ssl.HttpsURLConnection;
import java.lang.Object;

public class JavaCLient {

    private final String USER_AGENT = "Mozilla/5.0";

    public static void main(String[] args) throws Exception {

        JavaCLient http = new JavaCLient();

//        System.out.println("Testing 1 - Send Http GET request");
//        http.sendGet();

        System.out.println("\nTesting 2 - Send Http POST request");
        http.sendPost();

    }

    // HTTP GET request
    private void sendGet() throws Exception {

        String url = "http://118.33.122.32:10200/api/kod/v2/asps";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        // optional default is GET
        con.setRequestMethod("GET");

        //add request header
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }

    // HTTP POST request
    private void sendPost() throws Exception {

        //String url = "http://118.33.122.28:10100/issuer-authorization-system-1.0/api/recharge/imsi";
        String url = "http://118.33.122.28:20001/api/getTermsAndConditions";
        URL obj = new URL(url);
        //HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        //add reuqest header
        con.setRequestMethod("POST");
        //con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Content-Type", "application/json");
        //con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        //String urlParameters = "{\"userId\":\"43730\",\"amount\":1000}";
        String koreanText = new String("신한은행");
        byte ptext[] = koreanText.getBytes();
        String value = new String(ptext, "UTF-8");

        String urlParameters = "{\"aspId\"" + ":" + value + ",\"locale\":\"KO\"}";

        // Send post request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        String responseMsg =  con.getResponseMessage();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode + " Message : " + responseMsg);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //print result
        System.out.println(response.toString());

    }
}
